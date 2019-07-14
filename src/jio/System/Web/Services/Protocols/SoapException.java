package jio.System.Web.Services.Protocols;

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
import jio.System.Web.Services.Protocols.*;
import jio.System.Xml.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class SoapException extends SystemException implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public SoapException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Web.Services.Protocols.SoapException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SoapException(java.lang.String message, XmlQualifiedName code, java.lang.String actor) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Web.Services.Protocols.SoapException", message, code, actor);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SoapException(
      java.lang.String message,
      XmlQualifiedName code,
      java.lang.String actor,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Web.Services.Protocols.SoapException", message, code, actor, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SoapException(java.lang.String message, XmlQualifiedName code) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Web.Services.Protocols.SoapException", message, code);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SoapException(
      java.lang.String message, XmlQualifiedName code, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Web.Services.Protocols.SoapException", message, code, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SoapException(
      java.lang.String message, XmlQualifiedName code, java.lang.String actor, XmlNode detail) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Web.Services.Protocols.SoapException", message, code, actor, detail);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SoapException(
      java.lang.String message,
      XmlQualifiedName code,
      java.lang.String actor,
      XmlNode detail,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Web.Services.Protocols.SoapException",
              message,
              code,
              actor,
              detail,
              innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SoapException(java.lang.String message, XmlQualifiedName code, SoapFaultSubCode subCode) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Web.Services.Protocols.SoapException", message, code, subCode);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SoapException(
      java.lang.String message,
      XmlQualifiedName code,
      java.lang.String actor,
      java.lang.String role,
      XmlNode detail,
      SoapFaultSubCode subCode,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Web.Services.Protocols.SoapException",
              message,
              code,
              actor,
              role,
              detail,
              subCode,
              innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SoapException(
      java.lang.String message,
      XmlQualifiedName code,
      java.lang.String actor,
      java.lang.String role,
      java.lang.String lang,
      XmlNode detail,
      SoapFaultSubCode subCode,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Web.Services.Protocols.SoapException",
              message,
              code,
              actor,
              role,
              lang,
              detail,
              subCode,
              innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SoapException(NObject handle) {
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
