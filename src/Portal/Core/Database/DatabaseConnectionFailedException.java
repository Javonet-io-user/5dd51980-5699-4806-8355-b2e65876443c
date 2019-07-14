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

public class DatabaseConnectionFailedException extends DatabaseException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public DatabaseConnectionFailedException(java.lang.String msg) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Core.Database.DatabaseConnectionFailedException", msg);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatabaseConnectionFailedException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Portal.Core.Database.DatabaseConnectionFailedException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatabaseConnectionFailedException(
      java.lang.String Message, java.lang.Integer ErrorCode, java.lang.Integer ErrorNumber) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Portal.Core.Database.DatabaseConnectionFailedException",
              Message,
              ErrorCode,
              ErrorNumber);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatabaseConnectionFailedException(NObject handle) {
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
