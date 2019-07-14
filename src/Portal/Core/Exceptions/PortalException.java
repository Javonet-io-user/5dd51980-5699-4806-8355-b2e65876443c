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
import jio.System.*;
import Portal.Core.Exceptions.*;
import jio.System.Runtime.InteropServices.*;
import jio.System.Xml.*;
import jio.System.Runtime.Serialization.*;

public class PortalException extends jio.System.Exception implements ISerializable, _Exception {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMessage() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._Exception")
              .invoke("get_Message");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getStackTrace() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._Exception")
              .invoke("get_StackTrace");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public PortalException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Core.Exceptions.PortalException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PortalException(java.lang.String Message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Core.Exceptions.PortalException", Message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PortalException(java.lang.String Message, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Portal.Core.Exceptions.PortalException", Message, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PortalException(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._Exception")
              .invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetMessage(java.lang.String message) {
    try {
      javonetHandle.invoke("SetMessage", message);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadfromXml(XmlDocument xmldoc) {
    try {
      javonetHandle.invoke("LoadfromXml", xmldoc);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SavetoXml(XmlNode xmlnode) {
    try {
      javonetHandle.invoke("SavetoXml", xmlnode);
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
