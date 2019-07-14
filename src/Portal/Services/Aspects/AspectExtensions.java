package Portal.Services.Aspects;

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
import Portal.Services.Aspects.*;
import jio.System.*;
import Portal.Services.*;

public class AspectExtensions {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void LogService(java.lang.String methodname, Object[] parameters) {
    try {
      Javonet.getType("Portal.Services.Aspects.AspectExtensions")
          .invoke("LogService", methodname, new Object[] {parameters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ThrowExceptionsSoapCall(jio.System.Exception ex) {
    try {
      Javonet.getType("Portal.Services.Aspects.AspectExtensions")
          .invoke("ThrowExceptionsSoapCall", ex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static jio.System.Exception MapToPortalExceptions(jio.System.Exception tex) {
    try {
      Object res =
          Javonet.getType("Portal.Services.Aspects.AspectExtensions")
              .invoke("MapToPortalExceptions", tex);
      if (res == null) return null;
      return new jio.System.Exception((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void InvokeService(BaseSoapService ServiceLayer) {
    try {
      Javonet.getType("Portal.Services.Aspects.AspectExtensions")
          .invoke("InvokeService", ServiceLayer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
