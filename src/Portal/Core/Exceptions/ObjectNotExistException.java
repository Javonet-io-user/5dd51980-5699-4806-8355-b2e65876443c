package Portal.Core.Exceptions;

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
import Portal.Core.Exceptions.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class ObjectNotExistException extends PortalException implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public ObjectNotExistException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Core.Exceptions.ObjectNotExistException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ObjectNotExistException(jio.System.Type type) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Core.Exceptions.ObjectNotExistException", type);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ObjectNotExistException(jio.System.Type type, Object Identity) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Core.Exceptions.ObjectNotExistException", type, Identity);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ObjectNotExistException(java.lang.String type, Object Identity) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Core.Exceptions.ObjectNotExistException", type, Identity);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ObjectNotExistException(NObject handle) {
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
