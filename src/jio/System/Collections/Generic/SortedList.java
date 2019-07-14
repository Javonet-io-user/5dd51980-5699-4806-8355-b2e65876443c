package jio.System.Collections.Generic;

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
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.*;

public class SortedList<TKey, TValue>
    implements jio.System.Collections.Generic.IDictionary<TKey, TValue>,
        jio.System.Collections.Generic.ICollection<KeyValuePair<TKey, TValue>>,
        jio.System.Collections.Generic.IEnumerable<KeyValuePair<TKey, TValue>>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IDictionary,
        jio.System.Collections.ICollection,
        IReadOnlyDictionary<TKey, TValue>,
        IReadOnlyCollection<KeyValuePair<TKey, TValue>>,
        Iterable<KeyValuePair<TKey, TValue>> {
  protected NObject javonetHandle;

  @Override
  public Iterator<KeyValuePair<TKey, TValue>> iterator() {
    return (Iterator<KeyValuePair<TKey, TValue>>) this.GetEnumerator();
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public SortedList(Class<?> TKey, Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.SortedList`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public SortedList(java.lang.Integer capacity, Class<?> TKey, Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.SortedList`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public SortedList(
      jio.System.Collections.Generic.IComparer<TKey> comparer, Class<?> TKey, Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.SortedList`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public SortedList(
      java.lang.Integer capacity,
      jio.System.Collections.Generic.IComparer<TKey> comparer,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.SortedList`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public SortedList(
      jio.System.Collections.Generic.IDictionary<TKey, TValue> dictionary,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.SortedList`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public SortedList(
      jio.System.Collections.Generic.IDictionary<TKey, TValue> dictionary,
      jio.System.Collections.Generic.IComparer<TKey> comparer,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.SortedList`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SortedList(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.Generic.IEnumerator<KeyValuePair<TKey, TValue>> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsReadOnly() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(KeyValuePair<TKey, TValue> keyValuePair) {
    try {
      javonetHandle.invoke("Add", keyValuePair);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Contains(KeyValuePair<TKey, TValue> keyValuePair) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Contains", keyValuePair);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyTo(KeyValuePair[] array, java.lang.Integer arrayIndex) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array}, arrayIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Remove(KeyValuePair<TKey, TValue> keyValuePair) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Remove", keyValuePair);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public Object getItem(Object key) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("get_Item", key);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public void setItem(Object key, Object value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.IDictionary")
          .invoke("set_Item", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.ICollection getIDictionary_Keys() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Collections.IDictionary").invoke("get_Keys");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.ICollection getIDictionary_Values() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("get_Values");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Contains(Object key) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("Contains", key);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Add(Object key, Object value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.IDictionary")
          .invoke("Add", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIDictionary_IsReadOnly() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("get_IsReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsFixedSize() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("get_IsFixedSize");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDictionaryEnumerator IDictionary_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Remove(Object key) {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IDictionary").invoke("Remove", key);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyTo(java.lang.reflect.Array array, java.lang.Integer arrayIndex) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.ICollection")
          .invoke("CopyTo", array, arrayIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getSyncRoot() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_SyncRoot");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsSynchronized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_IsSynchronized");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.Generic.IEnumerable<TKey> getKeys() {
    try {
      Object res = javonetHandle.<NObject>get("Keys");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.Generic.IEnumerable<TValue> getValues() {
    try {
      Object res = javonetHandle.<NObject>get("Values");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
