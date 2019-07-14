package Portal.Services;

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
import Portal.Services.*;
import jio.System.*;
import jio.System.ComponentModel.*;

public abstract class BaseSoapSSOService extends BaseSoapService
    implements IComponent, IDisposable, IServiceProvider, IBaseService, IBaseSSOService {
  protected NObject javonetHandle;

  public BaseSoapSSOService(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public UserAccount[] GetListOfUsers(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("Portal.Services.IBaseSSOService")
              .invoke("GetListOfUsers");
      if (res == null) return null;
      return (UserAccount[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public UserAccount GetUserAccount(java.lang.String username) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Portal.Services.IBaseSSOService")
              .invoke("GetUserAccount", username);
      if (res == null) return null;
      return new UserAccount((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetPassword(java.lang.String username, java.lang.String newPassword) {
    try {
      javonetHandle
          .explicitInterface("Portal.Services.IBaseSSOService")
          .invoke("SetPassword", username, newPassword);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ValidateUserPass(java.lang.String username, java.lang.String password) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Portal.Services.IBaseSSOService")
              .invoke("ValidateUserPass", username, password);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
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
