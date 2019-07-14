package jio.System.Web.UI;

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
import jio.System.Web.UI.*;
import jio.System.ComponentModel.*;
import jio.System.*;
import jio.System.Collections.*;

public class Control
    implements IComponent,
        IDisposable,
        IParserAccessor,
        IUrlResolutionService,
        IDataBindingsAccessor,
        IControlBuilderAccessor,
        IControlDesignerAccessor,
        IExpressionsAccessor {
  protected NObject javonetHandle;

  public Control() {
    try {
      javonetHandle = Javonet.New("System.Web.UI.Control");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddParsedSubObject(Object obj) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Web.UI.IParserAccessor")
          .invoke("AddParsedSubObject", obj);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DataBindingCollection getDataBindings() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Web.UI.IDataBindingsAccessor")
              .invoke("get_DataBindings");
      if (res == null) return null;
      return new DataBindingCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHasDataBindings() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Web.UI.IDataBindingsAccessor")
              .invoke("get_HasDataBindings");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ControlBuilder getControlBuilder() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Web.UI.IControlBuilderAccessor")
              .invoke("get_ControlBuilder");
      if (res == null) return null;
      return new ControlBuilder((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IDictionary getUserData() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Web.UI.IControlDesignerAccessor")
              .invoke("get_UserData");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDictionary GetDesignModeState() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Web.UI.IControlDesignerAccessor")
              .invoke("GetDesignModeState");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetDesignModeState(IDictionary data) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Web.UI.IControlDesignerAccessor")
          .invoke("SetDesignModeState", data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetOwnerControl(Control owner) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Web.UI.IControlDesignerAccessor")
          .invoke("SetOwnerControl", owner);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHasExpressions() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Web.UI.IExpressionsAccessor")
              .invoke("get_HasExpressions");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ExpressionBindingCollection getExpressions() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Web.UI.IExpressionsAccessor")
              .invoke("get_Expressions");
      if (res == null) return null;
      return new ExpressionBindingCollection((NObject) res);
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
