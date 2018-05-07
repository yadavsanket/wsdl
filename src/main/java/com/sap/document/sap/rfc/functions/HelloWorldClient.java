package com.sap.document.sap.rfc.functions;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;

// COM_D50_JDA:JDA2018adj!


/*
public class CallWsdl {

    // HTTP Authentication
    static {

        java.net.Authenticator.setDefault(new java.net.Authenticator() {

            @Override
            protected java.net.PasswordAuthentication getPasswordAuthentication() {
                return new java.net.PasswordAuthentication("COM_D50_JDA", "JDA2018adj!".toCharArray());
            }
        });
    }

    public static void main(String[] args) {

        // Create service object and get port
        // Note: TestBean_Service is service class that can be found in
        // generated client artifacts and name may be different in your case

        TestBean_Service service = new TestBean_Service();
        TestBean port = service.getTestBeanPort();

        //Use BindingProvider API to provide credentials for API security
        BindingProvider prov = (BindingProvider) port;
        Map<String, Object> reqCtx = prov.getRequestContext();

        // API credentials
        reqCtx.put(BindingProvider.USERNAME_PROPERTY, "username");
        reqCtx.put(BindingProvider.PASSWORD_PROPERTY, "password");
        reqCtx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                "http://hostname/path/TestBean?");

        // Invoke webservice method through port
        Response response = port.doSomething(request);

    }

}

*/

/*
public class CallWsdl {
    public static void main(String[] args) {

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();



        factory.setServiceClass(IAbc.class);
        factory.setAddress("https://hiddendomain.com/abc/abc.svc/soap");

        IAbc info = (IAbc) factory.create();

        Client client = ClientProxy.getClient(info);
        HTTPConduit http = (HTTPConduit) client.getConduit();

        http.getAuthorization().

                setUserName("user");
        http.getAuthorization().

                setPassword("pass");

        String abc = info.abc();
    }
}
*/

/*
package com.sap.document.sap.rfc.functions;

import com.sap.document.sap.rfc.functions.D50;
import com.sap.document.sap.rfc.functions.ZBCEVENTRAISEWEB;

import javax.wsdl.Port;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;



public class CallWsdl {

    Service s = new Service();
    Port port = s.getPort();

    BindingProvider prov = (BindingProvider)port;
    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "myusername");
    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "mypassword");

    port.call();

    Authenticator myAuth = new Authenticator()
    {
        @Override
        protected PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication("COM_D50_JDA", "JDA2018adj!".toCharArray());
        }
    };

    Authenticator.setDefault(myAuth);

    public static void main(String[] args) {
        String relevanceQuery ="names of bes computers ";
        D50 d = new D50();
        ZBCEVENTRAISEWEB client;
        client = d.getPort(ZBCEVENTRAISEWEB.class);
        try {
            System.out.println(client.zbcEVENTRAISE(relevanceQuery, "", ""));
        }
        catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }
}
*/

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

import com.sap.document.sap.rfc.functions.HelloWorld;


public class HelloWorldClient{

    private static final String WS_URL = "http://concid505000.conti.de:8050/sap/bc/srt/rfc/sap/zbc_event_raise_web/100/d50/d50";

    public static void main(String[] args) throws Exception {

        URL url = new URL(WS_URL);
        QName qname = new QName("urn:sap-com:document:sap:rfc:functions", "HelloWorldImplService");

        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);

        /*******************UserName & Password ******************************/
        Map<String, Object> req_ctx = ((BindingProvider)hello).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("Username", Collections.singletonList("COM_D50_JDA"));
        headers.put("Password", Collections.singletonList("JDA2018adj!"));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
        /**********************************************************************/

        System.out.println(hello.getHelloWorldAsString());

    }
}