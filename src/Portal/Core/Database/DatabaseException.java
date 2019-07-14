package Portal.Core.Database;

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
import Portal.Core.Database.*;
import jio.System.Xml.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class DatabaseException extends PortalException implements ISerializable, _Exception {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getErrorCode() {
    try {
      java.lang.Integer res = javonetHandle.get("ErrorCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getErrorNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("ErrorNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public DatabaseException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Core.Database.DatabaseException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatabaseException(
      java.lang.String msg, java.lang.Integer ErrorCode, java.lang.Integer ErrorNumber) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Portal.Core.Database.DatabaseException", msg, ErrorCode, ErrorNumber);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatabaseException(
      java.lang.String msg,
      java.lang.Integer ErrorCode,
      java.lang.Integer ErrorNumber,
      java.lang.String StackTrace) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Portal.Core.Database.DatabaseException", msg, ErrorCode, ErrorNumber, StackTrace);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatabaseException(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
