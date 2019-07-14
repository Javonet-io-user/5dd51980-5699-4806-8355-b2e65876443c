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

public interface IBaseSSOService extends IBaseService {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public UserAccount[] GetListOfUsers(Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public UserAccount GetUserAccount(java.lang.String username);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void SetPassword(java.lang.String username, java.lang.String newPassword);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ValidateUserPass(java.lang.String username, java.lang.String password);
}
