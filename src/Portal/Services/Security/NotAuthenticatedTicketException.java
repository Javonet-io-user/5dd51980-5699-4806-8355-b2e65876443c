package Portal.Services.Security;

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
import Portal.Services.Security.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class NotAuthenticatedTicketException extends NotAuthenticatedTicketException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public NotAuthenticatedTicketException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Services.Security.NotAuthenticatedTicketException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotAuthenticatedTicketException(java.lang.String yourkey) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Portal.Services.Security.NotAuthenticatedTicketException", yourkey);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotAuthenticatedTicketException(jio.System.Exception inner) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Portal.Services.Security.NotAuthenticatedTicketException", inner);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NotAuthenticatedTicketException(NObject handle) {
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