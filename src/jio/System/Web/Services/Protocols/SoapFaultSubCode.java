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
import jio.System.Web.Services.Protocols.*;
import jio.System.Xml.*;

public class SoapFaultSubCode {
  public NObject javonetHandle;

  public SoapFaultSubCode(XmlQualifiedName code) {
    try {
      javonetHandle = Javonet.New("System.Web.Services.Protocols.SoapFaultSubCode", code);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SoapFaultSubCode(XmlQualifiedName code, SoapFaultSubCode subCode) {
    try {
      javonetHandle = Javonet.New("System.Web.Services.Protocols.SoapFaultSubCode", code, subCode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SoapFaultSubCode(NObject handle) {
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
