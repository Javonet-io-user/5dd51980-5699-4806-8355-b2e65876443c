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

public interface IRemoteService {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long GetCurrentTimeStamp();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Test();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IAuthenticationHeader getAuthentication();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUrl();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setUrl(java.lang.String value);
}
