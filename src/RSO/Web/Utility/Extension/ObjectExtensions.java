package RSO.Web.Utility.Extension;

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
import RSO.Web.Utility.Extension.*;
import jio.System.*;

public class ObjectExtensions {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ToBoolean(Object obj, java.lang.Boolean default_bool) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RSO.Web.Utility.Extension.ObjectExtensions")
              .invoke("ToBoolean", obj, default_bool);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ToBoolean(Object obj) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RSO.Web.Utility.Extension.ObjectExtensions").invoke("ToBoolean", obj);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ToValidInteger(Object obj, java.lang.Integer default_no) {
    try {
      java.lang.Integer res =
          Javonet.getType("RSO.Web.Utility.Extension.ObjectExtensions")
              .invoke("ToValidInteger", obj, default_no);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ToValidInteger(Object obj) {
    try {
      java.lang.Integer res =
          Javonet.getType("RSO.Web.Utility.Extension.ObjectExtensions")
              .invoke("ToValidInteger", obj);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long ToValidLongInteger(Object obj, java.lang.Long default_no) {
    try {
      java.lang.Long res =
          Javonet.getType("RSO.Web.Utility.Extension.ObjectExtensions")
              .invoke("ToValidLongInteger", obj, default_no);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long ToValidLongInteger(Object obj) {
    try {
      java.lang.Long res =
          Javonet.getType("RSO.Web.Utility.Extension.ObjectExtensions")
              .invoke("ToValidLongInteger", obj);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double ToValidDoubleNumber(Object obj, java.lang.Double default_no) {
    try {
      java.lang.Double res =
          Javonet.getType("RSO.Web.Utility.Extension.ObjectExtensions")
              .invoke("ToValidDoubleNumber", obj, default_no);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double ToValidDoubleNumber(Object obj) {
    try {
      java.lang.Double res =
          Javonet.getType("RSO.Web.Utility.Extension.ObjectExtensions")
              .invoke("ToValidDoubleNumber", obj);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
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
