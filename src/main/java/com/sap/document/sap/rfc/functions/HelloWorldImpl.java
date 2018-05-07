package com.sap.document.sap.rfc.functions;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

//Service Implementation Bean
@WebService(endpointInterface = "com.mkyong.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    @Resource
    WebServiceContext wsctx;

    @Override
    public String getHelloWorldAsString() {

        MessageContext mctx = wsctx.getMessageContext();

        //get detail from request headers
        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) http_headers.get("COM_D50_JDA");
        List passList = (List) http_headers.get("JDA2018adj!");

        String username = "";
        String password = "";

        if(userList!=null){
            //get username
            username = userList.get(0).toString();
        }

        if(passList!=null){
            //get password
            password = passList.get(0).toString();
        }

        //Should validate username and password with database
        if (username.equals("COM_D50_JDA") && password.equals("JDA2018adj!")){
            return "Hello World JAX-WS - Valid User!";
        }else{
            return "Unknown User!";
        }

    }
}
