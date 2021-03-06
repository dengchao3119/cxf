package com.bsoft.wechat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.3
 * 2018-05-22T17:19:26.753+08:00
 * Generated source version: 3.2.3
 *
 */
@WebService(targetNamespace = "http://www.bsoft.com.cn/webservices/", name = "ServiceHttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ServiceHttpPost {

    /**
     * 【数据交换平台】
     */
    @WebMethod(operationName = "MainWebInterface")
    @WebResult(name = "string", targetNamespace = "http://www.bsoft.com.cn/webservices/", partName = "Body")
    public java.lang.String mainWebInterface(
        @WebParam(partName = "DbType", name = "DbType", targetNamespace = "http://www.bsoft.com.cn/webservices/")
        java.lang.String dbType,
        @WebParam(partName = "OrgId", name = "OrgId", targetNamespace = "http://www.bsoft.com.cn/webservices/")
        java.lang.String orgId,
        @WebParam(partName = "UserId", name = "UserId", targetNamespace = "http://www.bsoft.com.cn/webservices/")
        java.lang.String userId,
        @WebParam(partName = "PassWord", name = "PassWord", targetNamespace = "http://www.bsoft.com.cn/webservices/")
        java.lang.String passWord,
        @WebParam(partName = "MethordName", name = "MethordName", targetNamespace = "http://www.bsoft.com.cn/webservices/")
        java.lang.String methordName,
        @WebParam(partName = "InXML", name = "InXML", targetNamespace = "http://www.bsoft.com.cn/webservices/")
        java.lang.String inXML
    );
}
