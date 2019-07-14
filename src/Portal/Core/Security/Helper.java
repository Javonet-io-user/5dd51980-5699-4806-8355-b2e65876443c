package Portal.Core.Security;

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
import Portal.Core.Security.*;

public class Helper {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Long getTimeStamp() {
    try {
      java.lang.Long res = Javonet.getType("Portal.Core.Security.Helper").get("TimeStamp");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Long getSecondDiv() {
    try {
      java.lang.Long res = Javonet.getType("Portal.Core.Security.Helper").get("SecondDiv");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSecondDiv(java.lang.Long param) {
    try {
      Javonet.getType("Portal.Core.Security.Helper").set("SecondDiv", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean CheckTimeStampAuthenticator(
      java.lang.String Authenticator, java.lang.String key) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Portal.Core.Security.Helper")
              .invoke("CheckTimeStampAuthenticator", Authenticator, key);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean CheckTimeStampAuthenticator(
      java.lang.String Authenticator, java.lang.String key, java.lang.String Data) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Portal.Core.Security.Helper")
              .invoke("CheckTimeStampAuthenticator", Authenticator, key, Data);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean CheckTimeStampAuthenticator(
      java.lang.String Authenticator,
      java.lang.String key,
      java.lang.String Data,
      java.lang.Integer timerange) {
    try {
      java.lang.Boolean res =
          Javonet.getType("Portal.Core.Security.Helper")
              .invoke("CheckTimeStampAuthenticator", Authenticator, key, Data, timerange);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateTimeStampTicket(java.lang.String Key) {
    try {
      java.lang.String res =
          Javonet.getType("Portal.Core.Security.Helper").invoke("CreateTimeStampTicket", Key);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateTimeStampTicket(
      java.lang.String Data, java.lang.String Key, java.lang.Long timestamp) {
    try {
      java.lang.String res =
          Javonet.getType("Portal.Core.Security.Helper")
              .invoke("CreateTimeStampTicket", Data, Key, timestamp);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String CreateTimeStampTicket(
      java.lang.String Key, java.lang.Long timestamp) {
    try {
      java.lang.String res =
          Javonet.getType("Portal.Core.Security.Helper")
              .invoke("CreateTimeStampTicket", Key, timestamp);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long GetTimeStamp(TimeStampUnit unit) {
    try {
      java.lang.Long res =
          Javonet.getType("Portal.Core.Security.Helper")
              .invoke("GetTimeStamp", NEnum.fromJavaEnum(unit));
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long GetTimeStamp(java.lang.Long ticks, TimeStampUnit unit) {
    try {
      java.lang.Long res =
          Javonet.getType("Portal.Core.Security.Helper")
              .invoke("GetTimeStamp", ticks, NEnum.fromJavaEnum(unit));
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
