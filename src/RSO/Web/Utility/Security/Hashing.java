package RSO.Web.Utility.Security;

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
import RSO.Web.Utility.Security.*;

public class Hashing {
  protected NObject javonetHandle;

  public Hashing() {
    try {
      javonetHandle = Javonet.New("RSO.Web.Utility.Security.Hashing");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashing(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetHash(java.lang.String pass) {
    try {
      java.lang.String res =
          Javonet.getType("RSO.Web.Utility.Security.Hashing").invoke("GetHash", pass);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetHashHex(java.lang.String pass) {
    try {
      java.lang.String res =
          Javonet.getType("RSO.Web.Utility.Security.Hashing").invoke("GetHashHex", pass);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] GetHashBytes(java.lang.String pass, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("RSO.Web.Utility.Security.Hashing").invoke("GetHashBytes", pass);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte GetDigest(java.lang.String pass) {
    try {
      java.lang.Byte res =
          Javonet.getType("RSO.Web.Utility.Security.Hashing").invoke("GetDigest", pass);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
