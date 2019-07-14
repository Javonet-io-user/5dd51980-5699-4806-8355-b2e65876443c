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
import jio.System.Web.*;

public class Page extends TemplateControl
    implements IComponent,
        IDisposable,
        IParserAccessor,
        IUrlResolutionService,
        IDataBindingsAccessor,
        IControlBuilderAccessor,
        IControlDesignerAccessor,
        IExpressionsAccessor,
        INamingContainer,
        IFilterResolutionService,
        IHttpHandler {
  protected NObject javonetHandle;

  public Page() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Web.UI.Page");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Page(NObject handle) {
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
