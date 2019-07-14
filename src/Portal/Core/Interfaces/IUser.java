package Portal.Core.Interfaces;

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
import Portal.Core.Interfaces.*;
import jio.System.*;

public interface IUser {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getUID();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUserName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFullName();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setUID(Nullable<java.lang.Long> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setUserName(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setFullName(java.lang.String value);
}
