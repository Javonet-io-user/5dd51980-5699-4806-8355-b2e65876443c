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
import Portal.Core.Database.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class DatabaseLoginFailedException extends DatabaseConnectionFailedException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getServer() {
    try {
      java.lang.String res = javonetHandle.get("Server");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public DatabaseLoginFailedException(java.lang.String msg) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Core.Database.DatabaseLoginFailedException", msg);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatabaseLoginFailedException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Core.Database.DatabaseLoginFailedException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatabaseLoginFailedException(
      java.lang.String Message,
      java.lang.Integer ErrorCode,
      java.lang.Integer ErrorNumber,
      java.lang.String Server) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Portal.Core.Database.DatabaseLoginFailedException",
              Message,
              ErrorCode,
              ErrorNumber,
              Server);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatabaseLoginFailedException(NObject handle) {
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
