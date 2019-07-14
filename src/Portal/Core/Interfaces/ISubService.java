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

public interface ISubService {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Test(AtomicReference<java.lang.String> AdditionalInfo);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer RandomRequestTest();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCompositeCallMode();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCompositeCallMode(java.lang.Boolean value);
}
