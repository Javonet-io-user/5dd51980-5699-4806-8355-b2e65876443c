package RSO.Web.Utility.Data.Sql;

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
import RSO.Web.Utility.Data.Sql.*;
import jio.System.*;
import RSO.Web.Utility.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.Data.*;
import jio.System.Data.SqlClient.*;

public class DatabaseUtility {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getConnectionString() {
    try {
      java.lang.String res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility").get("ConnectionString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static SqlConnection getconnection() {
    try {
      Object res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility").<NObject>get("connection");
      if (res == null) return null;
      return new SqlConnection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DatabaseUtility() {
    try {
      javonetHandle = Javonet.New("RSO.Web.Utility.Data.Sql.DatabaseUtility");
      javonetHandle.addEventListener(
          "OnSqlError",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DatabaseUtility.SqlErrorHandler handler : _OnSqlErrorListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.String.class),
                    Convert(objects[1], jio.System.Exception.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DatabaseUtility(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void RefreshConnections() {
    try {
      Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility").invoke("RefreshConnections");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ExecCmdasIntegerValue(java.lang.String cmdstr) {
    try {
      java.lang.Integer res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
              .invoke("ExecCmdasIntegerValue", cmdstr);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ExecCmdasBooleanValue(java.lang.String cmdstr, Object[] param) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
              .invoke("ExecCmdasBooleanValue", cmdstr, new Object[] {param});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ExecAsBooleanOrDefault(
      java.lang.String cmdstr, java.lang.Boolean def, Object[] param) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
              .invoke("ExecAsBooleanOrDefault", cmdstr, def, new Object[] {param});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ExecCmd(java.lang.String cmdstr, Object[] param) {
    try {
      Object res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
              .invoke("ExecCmd", cmdstr, new Object[] {param});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Object ExecCmdOrDefault(
      java.lang.String cmdstr, Object convertnullto, Object[] param) {
    try {
      Object res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
              .invoke("ExecCmdOrDefault", cmdstr, convertnullto, new Object[] {param});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static CaseInsensetiveSortedList ExecReaderSingleRow(
      java.lang.String cmdstr, Object[] param) {
    try {
      Object res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
              .invoke("ExecReaderSingleRow", cmdstr, new Object[] {param});
      if (res == null) return null;
      return new CaseInsensetiveSortedList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static CaseInsensetiveSortedList[] Select(
      java.lang.String cmdstr, Object[] param, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
              .invoke("Select", cmdstr, new Object[] {param});
      if (res == null) return null;
      return (CaseInsensetiveSortedList[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static CaseInsensetiveSortedList SelectSingleRow(java.lang.String cmdstr, Object[] param) {
    try {
      Object res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
              .invoke("SelectSingleRow", cmdstr, new Object[] {param});
      if (res == null) return null;
      return new CaseInsensetiveSortedList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static CaseInsensetiveSortedList[] ExecReaderAllRow(
      java.lang.String cmdstr, Object[] param, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
              .invoke("ExecReaderAllRow", cmdstr, new Object[] {param});
      if (res == null) return null;
      return (CaseInsensetiveSortedList[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static CaseInsensetiveSortedList[][] ExecReadersAllRow(
      java.lang.String cmdstr, Class<?> returnArrayType) {
    try {
      Object[][] res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
              .invoke("ExecReadersAllRow", cmdstr);
      if (res == null) return null;
      return (CaseInsensetiveSortedList[][])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> List<T> ExecReader(java.lang.String cmdstr, Object[] param) {
    try {
      Object res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
              .invoke("ExecReader", cmdstr, new Object[] {param});
      if (res == null) return null;
      return new List<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static jio.System.Collections.ArrayList ExecReader(java.lang.String cmdstr) {
    try {
      Object res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility").invoke("ExecReader", cmdstr);
      if (res == null) return null;
      return new jio.System.Collections.ArrayList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DataTable ExecDataTable(java.lang.String cmdstr) {
    try {
      Object res =
          Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
              .invoke("ExecDataTable", cmdstr);
      if (res == null) return null;
      return new DataTable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Update(
      java.lang.String TableName,
      java.lang.String FieldName,
      java.lang.String NewValue,
      java.lang.String WhereCluase,
      Object[] param) {
    try {
      Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
          .invoke("Update", TableName, FieldName, NewValue, WhereCluase, new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ExecCmdnoneQuery(java.lang.String cmdstr, Object[] param) {
    try {
      Javonet.getType("RSO.Web.Utility.Data.Sql.DatabaseUtility")
          .invoke("ExecCmdnoneQuery", cmdstr, new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<DatabaseUtility.SqlErrorHandler> _OnSqlErrorListeners =
      new java.util.ArrayList<DatabaseUtility.SqlErrorHandler>();

  public void addOnSqlError(DatabaseUtility.SqlErrorHandler toAdd) {
    _OnSqlErrorListeners.add(toAdd);
  }

  public void removeOnSqlError(DatabaseUtility.SqlErrorHandler toRemove) {
    _OnSqlErrorListeners.remove(toRemove);
  }

  public interface SqlErrorHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(java.lang.String Query, jio.System.Exception ex);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
