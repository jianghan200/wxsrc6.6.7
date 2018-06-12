package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class r
{
  public static void a(Object paramObject, View paramView)
  {
    ((Transition)paramObject).setEpicenterCallback(new Transition.EpicenterCallback()
    {
      public final Rect onGetEpicenter(Transition paramAnonymousTransition)
      {
        return this.oH;
      }
    });
  }
  
  public static void a(Object paramObject, View paramView, Map<String, View> paramMap, ArrayList<View> paramArrayList)
  {
    paramObject = (TransitionSet)paramObject;
    paramArrayList.clear();
    paramArrayList.addAll(paramMap.values());
    paramMap = ((TransitionSet)paramObject).getTargets();
    paramMap.clear();
    int n = paramArrayList.size();
    int i = 0;
    while (i < n)
    {
      Object localObject = (View)paramArrayList.get(i);
      int m = paramMap.size();
      if (!a(paramMap, (View)localObject, m))
      {
        paramMap.add(localObject);
        int j = m;
        while (j < paramMap.size())
        {
          localObject = (View)paramMap.get(j);
          if ((localObject instanceof ViewGroup))
          {
            localObject = (ViewGroup)localObject;
            int i1 = ((ViewGroup)localObject).getChildCount();
            int k = 0;
            while (k < i1)
            {
              View localView = ((ViewGroup)localObject).getChildAt(k);
              if (!a(paramMap, localView, m)) {
                paramMap.add(localView);
              }
              k += 1;
            }
          }
          j += 1;
        }
      }
      i += 1;
    }
    paramArrayList.add(paramView);
    b(paramObject, paramArrayList);
  }
  
  public static void a(Object paramObject, View paramView, boolean paramBoolean)
  {
    ((Transition)paramObject).excludeTarget(paramView, paramBoolean);
  }
  
  public static void a(Object paramObject, ArrayList<View> paramArrayList)
  {
    paramObject = (Transition)paramObject;
    int i;
    if ((paramObject instanceof TransitionSet))
    {
      paramObject = (TransitionSet)paramObject;
      int j = ((TransitionSet)paramObject).getTransitionCount();
      i = 0;
      while (i < j)
      {
        a(((TransitionSet)paramObject).getTransitionAt(i), paramArrayList);
        i += 1;
      }
    }
    if (!a((Transition)paramObject))
    {
      List localList = ((Transition)paramObject).getTargets();
      if ((localList != null) && (localList.size() == paramArrayList.size()) && (localList.containsAll(paramArrayList)))
      {
        i = paramArrayList.size() - 1;
        while (i >= 0)
        {
          ((Transition)paramObject).removeTarget((View)paramArrayList.get(i));
          i -= 1;
        }
      }
    }
  }
  
  static void a(ArrayList<View> paramArrayList, View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      if (!(paramView instanceof ViewGroup)) {
        break label61;
      }
      paramView = (ViewGroup)paramView;
      if (!paramView.isTransitionGroup()) {
        break label33;
      }
      paramArrayList.add(paramView);
    }
    for (;;)
    {
      return;
      label33:
      int j = paramView.getChildCount();
      int i = 0;
      while (i < j)
      {
        a(paramArrayList, paramView.getChildAt(i));
        i += 1;
      }
    }
    label61:
    paramArrayList.add(paramView);
  }
  
  public static void a(Map<String, View> paramMap, View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      String str = paramView.getTransitionName();
      if (str != null) {
        paramMap.put(str, paramView);
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int j = paramView.getChildCount();
        int i = 0;
        while (i < j)
        {
          a(paramMap, paramView.getChildAt(i));
          i += 1;
        }
      }
    }
  }
  
  private static boolean a(Transition paramTransition)
  {
    return (!g(paramTransition.getTargetIds())) || (!g(paramTransition.getTargetNames())) || (!g(paramTransition.getTargetTypes()));
  }
  
  private static boolean a(List<View> paramList, View paramView, int paramInt)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < paramInt)
      {
        if (paramList.get(i) == paramView) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public static void b(Object paramObject, ArrayList<View> paramArrayList)
  {
    int i = 0;
    paramObject = (Transition)paramObject;
    int j;
    if ((paramObject instanceof TransitionSet))
    {
      paramObject = (TransitionSet)paramObject;
      j = ((TransitionSet)paramObject).getTransitionCount();
      while (i < j)
      {
        b(((TransitionSet)paramObject).getTransitionAt(i), paramArrayList);
        i += 1;
      }
    }
    if ((!a((Transition)paramObject)) && (g(((Transition)paramObject).getTargets())))
    {
      j = paramArrayList.size();
      i = 0;
      while (i < j)
      {
        ((Transition)paramObject).addTarget((View)paramArrayList.get(i));
        i += 1;
      }
    }
  }
  
  public static Object f(Object paramObject)
  {
    Object localObject = paramObject;
    if (paramObject != null) {
      localObject = ((Transition)paramObject).clone();
    }
    return localObject;
  }
  
  private static boolean g(List paramList)
  {
    return (paramList == null) || (paramList.isEmpty());
  }
  
  static Rect x(View paramView)
  {
    Rect localRect = new Rect();
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    localRect.set(arrayOfInt[0], arrayOfInt[1], arrayOfInt[0] + paramView.getWidth(), arrayOfInt[1] + paramView.getHeight());
    return localRect;
  }
  
  public static final class a
  {
    public View oW;
  }
  
  public static abstract interface b
  {
    public abstract View getView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */