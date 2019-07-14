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

public abstract class TemplateControl extends Control
    implements IComponent,
        IDisposable,
        IParserAccessor,
        IUrlResolutionService,
        IDataBindingsAccessor,
        IControlBuilderAccessor,
        IControlDesignerAccessor,
        IExpressionsAccessor,
        INamingContainer,
        IFilterResolutionService {
  protected NObject javonetHandle;

  public TemplateControl(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean EvaluateFilter(java.lang.String filterName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Web.UI.IFilterResolutionService")
              .invoke("EvaluateFilter", filterName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CompareFilters(java.lang.String filter1, java.lang.String filter2) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("jio.System.Web.UI.IFilterResolutionService")
              .invoke("CompareFilters", filter1, filter2);
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
