package Portal.Services.SoapHeaders;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.Web.Services.Protocols.*;
import Portal.Services.SoapHeaders.*;

public class AuthenticationHeader extends SoapHeader implements IAuthenticationHeader {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setTGT(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("Portal.Services.SoapHeaders.IAuthenticationHeader")
          .invoke("set_TGT", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTGT() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Portal.Services.SoapHeaders.IAuthenticationHeader")
              .invoke("get_TGT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAuthenticator(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("Portal.Services.SoapHeaders.IAuthenticationHeader")
          .invoke("set_Authenticator", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getAuthenticator() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Portal.Services.SoapHeaders.IAuthenticationHeader")
              .invoke("get_Authenticator");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public AuthenticationHeader() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Services.SoapHeaders.AuthenticationHeader");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AuthenticationHeader(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}