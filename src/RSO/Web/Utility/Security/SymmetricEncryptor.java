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

public class SymmetricEncryptor {
  protected NObject javonetHandle;

  public SymmetricEncryptor() {
    try {
      javonetHandle = Javonet.New("RSO.Web.Utility.Security.SymmetricEncryptor");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SymmetricEncryptor(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String Encrypt(java.lang.String plain, java.lang.String key) {
    try {
      java.lang.String res =
          Javonet.getType("RSO.Web.Utility.Security.SymmetricEncryptor")
              .invoke("Encrypt", plain, key);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String Decrypt(java.lang.String chiper, java.lang.String key) {
    try {
      java.lang.String res =
          Javonet.getType("RSO.Web.Utility.Security.SymmetricEncryptor")
              .invoke("Decrypt", chiper, key);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
