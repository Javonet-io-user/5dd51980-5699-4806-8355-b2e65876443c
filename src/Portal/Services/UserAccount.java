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
import Portal.Core.Interfaces.*;

public class UserAccount implements IUser {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setUID(Nullable<java.lang.Long> value) {
    try {
      javonetHandle.explicitInterface("Portal.Core.Interfaces.IUser").invoke("set_UID", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getUID() {
    try {
      Object res =
          javonetHandle.explicitInterface("Portal.Core.Interfaces.IUser").invoke("get_UID");
      if (res == null) return null;
      return new Nullable<java.lang.Long>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUserName(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("Portal.Core.Interfaces.IUser").invoke("set_UserName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUserName() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Portal.Core.Interfaces.IUser").invoke("get_UserName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFullName(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("Portal.Core.Interfaces.IUser").invoke("set_FullName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFullName() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Portal.Core.Interfaces.IUser").invoke("get_FullName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public UserAccount() {
    try {
      javonetHandle = Javonet.New("Portal.Services.UserAccount");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UserAccount(NObject handle) {
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
