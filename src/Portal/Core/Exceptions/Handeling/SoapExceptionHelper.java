package Portal.Core.Exceptions.Handeling;

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
import Portal.Core.Exceptions.Handeling.*;
import jio.System.*;
import jio.System.Web.Services.Protocols.*;
import Portal.Core.Exceptions.*;

public class SoapExceptionHelper {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public PortalException getException() {
    try {
      Object res = javonetHandle.<NObject>get("Exception");
      if (res == null) return null;
      return new PortalException((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SoapException getSoapException() {
    try {
      Object res = javonetHandle.<NObject>get("SoapException");
      if (res == null) return null;
      return new SoapException((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SoapExceptionHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ThrowException(jio.System.Exception exception) {
    try {
      Javonet.getType("Portal.Core.Exceptions.Handeling.SoapExceptionHelper")
          .invoke("ThrowException", exception);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static SoapExceptionHelper HandleException(SoapException se) {
    try {
      Object res =
          Javonet.getType("Portal.Core.Exceptions.Handeling.SoapExceptionHelper")
              .invoke("HandleException", se);
      if (res == null) return null;
      return new SoapExceptionHelper((NObject) res);
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
