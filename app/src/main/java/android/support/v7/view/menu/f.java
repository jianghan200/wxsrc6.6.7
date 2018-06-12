package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.c.a.a;
import android.support.v4.view.d;
import android.support.v4.view.m;
import android.support.v7.a.a.b;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class f
  implements a
{
  private static final int[] Id = { 1, 4, 5, 3, 2, 0 };
  private boolean Ie;
  private boolean If;
  public a Ig;
  private ArrayList<h> Ih;
  private boolean Ii;
  public ArrayList<h> Ij;
  private ArrayList<h> Ik;
  private boolean Il;
  public int Im = 0;
  private ContextMenu.ContextMenuInfo In;
  CharSequence Io;
  Drawable Ip;
  View Iq;
  private boolean Ir = false;
  private boolean Is = false;
  boolean It = false;
  private boolean Iu = false;
  private ArrayList<h> Iv = new ArrayList();
  public CopyOnWriteArrayList<WeakReference<l>> Iw = new CopyOnWriteArrayList();
  h Ix;
  public boolean Iy;
  ArrayList<h> bA;
  public final Context mContext;
  private final Resources mResources;
  
  public f(Context paramContext)
  {
    this.mContext = paramContext;
    this.mResources = paramContext.getResources();
    this.bA = new ArrayList();
    this.Ih = new ArrayList();
    this.Ii = true;
    this.Ij = new ArrayList();
    this.Ik = new ArrayList();
    this.Il = true;
    if ((this.mResources.getConfiguration().keyboard != 1) && (this.mResources.getBoolean(a.b.abc_config_showMenuShortcutsWhenKeyboardPresent))) {}
    for (;;)
    {
      this.If = bool;
      return;
      bool = false;
    }
  }
  
  private h a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = this.Iv;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    if (localArrayList.isEmpty())
    {
      paramKeyEvent = null;
      return paramKeyEvent;
    }
    int k = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    paramKeyEvent.getKeyData(localKeyData);
    int m = localArrayList.size();
    if (m == 1) {
      return (h)localArrayList.get(0);
    }
    boolean bool = dH();
    int i = 0;
    label84:
    if (i < m)
    {
      h localh = (h)localArrayList.get(i);
      if (bool) {}
      for (int j = localh.getAlphabeticShortcut();; j = localh.getNumericShortcut())
      {
        if (j == localKeyData.meta[0])
        {
          paramKeyEvent = localh;
          if ((k & 0x2) == 0) {
            break;
          }
        }
        if (j == localKeyData.meta[2])
        {
          paramKeyEvent = localh;
          if ((k & 0x2) != 0) {
            break;
          }
        }
        if ((bool) && (j == 8))
        {
          paramKeyEvent = localh;
          if (paramInt == 67) {
            break;
          }
        }
        i += 1;
        break label84;
      }
    }
    return null;
  }
  
  private void a(List<h> paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = dH();
    int k = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67)) {
      return;
    }
    int m = this.bA.size();
    int i = 0;
    label49:
    h localh;
    if (i < m)
    {
      localh = (h)this.bA.get(i);
      if (localh.hasSubMenu()) {
        ((f)localh.getSubMenu()).a(paramList, paramInt, paramKeyEvent);
      }
      if (!bool) {
        break label184;
      }
    }
    label184:
    for (int j = localh.getAlphabeticShortcut();; j = localh.getNumericShortcut())
    {
      if (((k & 0x5) == 0) && (j != 0) && ((j == localKeyData.meta[0]) || (j == localKeyData.meta[2]) || ((bool) && (j == 8) && (paramInt == 67))) && (localh.isEnabled())) {
        paramList.add(localh);
      }
      i += 1;
      break label49;
      break;
    }
  }
  
  private static int b(ArrayList<h> paramArrayList, int paramInt)
  {
    int i = paramArrayList.size() - 1;
    while (i >= 0)
    {
      if (((h)paramArrayList.get(i)).Ho <= paramInt) {
        return i + 1;
      }
      i -= 1;
    }
    return 0;
  }
  
  private void m(int paramInt, boolean paramBoolean)
  {
    if ((paramInt < 0) || (paramInt >= this.bA.size())) {}
    do
    {
      return;
      this.bA.remove(paramInt);
    } while (!paramBoolean);
    p(true);
  }
  
  public final void J(boolean paramBoolean)
  {
    if (this.Iu) {
      return;
    }
    this.Iu = true;
    Iterator localIterator = this.Iw.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      l locall = (l)localWeakReference.get();
      if (locall == null) {
        this.Iw.remove(localWeakReference);
      } else {
        locall.a(this, paramBoolean);
      }
    }
    this.Iu = false;
  }
  
  public final MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i = (0xFFFF0000 & paramInt3) >> 16;
    if ((i < 0) || (i >= Id.length)) {
      throw new IllegalArgumentException("order does not contain a valid category.");
    }
    i = Id[i] << 16 | 0xFFFF & paramInt3;
    paramCharSequence = new h(this, paramInt1, paramInt2, paramInt3, i, paramCharSequence, this.Im);
    if (this.In != null) {
      paramCharSequence.IK = this.In;
    }
    this.bA.add(b(this.bA, i), paramCharSequence);
    p(true);
    return paramCharSequence;
  }
  
  public void a(a parama)
  {
    this.Ig = parama;
  }
  
  public final void a(l paraml)
  {
    a(paraml, this.mContext);
  }
  
  public final void a(l paraml, Context paramContext)
  {
    this.Iw.add(new WeakReference(paraml));
    paraml.a(paramContext, this);
    this.Il = true;
  }
  
  final void a(CharSequence paramCharSequence, Drawable paramDrawable, View paramView)
  {
    if (paramView != null)
    {
      this.Iq = paramView;
      this.Io = null;
      this.Ip = null;
    }
    for (;;)
    {
      p(false);
      return;
      if (paramCharSequence != null) {
        this.Io = paramCharSequence;
      }
      if (paramDrawable != null) {
        this.Ip = paramDrawable;
      }
      this.Iq = null;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, l paraml, int paramInt)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    paramMenuItem = (h)paramMenuItem;
    if ((paramMenuItem == null) || (!paramMenuItem.isEnabled())) {
      bool1 = false;
    }
    boolean bool3;
    Object localObject;
    label95:
    do
    {
      return bool1;
      bool3 = paramMenuItem.dR();
      localObject = paramMenuItem.IH;
      if ((localObject != null) && (((d)localObject).hasSubMenu())) {}
      for (int i = 1;; i = 0)
      {
        if (!paramMenuItem.dY()) {
          break label95;
        }
        bool2 = paramMenuItem.expandActionView() | bool3;
        bool1 = bool2;
        if (!bool2) {
          break;
        }
        J(true);
        return bool2;
      }
      if ((!paramMenuItem.hasSubMenu()) && (i == 0)) {
        break label283;
      }
      J(false);
      if (!paramMenuItem.hasSubMenu()) {
        paramMenuItem.b(new p(this.mContext, this, paramMenuItem));
      }
      paramMenuItem = (p)paramMenuItem.getSubMenu();
      if (i != 0) {
        ((d)localObject).onPrepareSubMenu(paramMenuItem);
      }
      if (!this.Iw.isEmpty()) {
        break;
      }
      bool2 = bool3 | bool1;
      bool1 = bool2;
    } while (bool2);
    J(true);
    return bool2;
    bool1 = bool2;
    if (paraml != null) {
      bool1 = paraml.a(paramMenuItem);
    }
    paraml = this.Iw.iterator();
    label214:
    while (paraml.hasNext())
    {
      localObject = (WeakReference)paraml.next();
      l locall = (l)((WeakReference)localObject).get();
      if (locall == null)
      {
        this.Iw.remove(localObject);
      }
      else
      {
        if (bool1) {
          break label297;
        }
        bool1 = locall.a(paramMenuItem);
      }
    }
    label283:
    label297:
    for (;;)
    {
      break label214;
      break;
      if ((paramInt & 0x1) == 0) {
        J(true);
      }
      return bool3;
    }
  }
  
  public MenuItem add(int paramInt)
  {
    return a(0, 0, 0, this.mResources.getString(paramInt));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, this.mResources.getString(paramInt4));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = this.mContext.getPackageManager();
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i;
    label52:
    ResolveInfo localResolveInfo;
    if (localList != null)
    {
      i = localList.size();
      if ((paramInt4 & 0x1) == 0) {
        removeGroup(paramInt1);
      }
      paramInt4 = 0;
      if (paramInt4 >= i) {
        break label214;
      }
      localResolveInfo = (ResolveInfo)localList.get(paramInt4);
      if (localResolveInfo.specificIndex >= 0) {
        break label201;
      }
    }
    label201:
    for (paramComponentName = paramIntent;; paramComponentName = paramArrayOfIntent[localResolveInfo.specificIndex])
    {
      paramComponentName = new Intent(paramComponentName);
      paramComponentName.setComponent(new ComponentName(localResolveInfo.activityInfo.applicationInfo.packageName, localResolveInfo.activityInfo.name));
      paramComponentName = add(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setIntent(paramComponentName);
      if ((paramArrayOfMenuItem != null) && (localResolveInfo.specificIndex >= 0)) {
        paramArrayOfMenuItem[localResolveInfo.specificIndex] = paramComponentName;
      }
      paramInt4 += 1;
      break label52;
      i = 0;
      break;
    }
    label214:
    return i;
  }
  
  public SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, this.mResources.getString(paramInt));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.mResources.getString(paramInt4));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    paramCharSequence = (h)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    p localp = new p(this.mContext, this, paramCharSequence);
    paramCharSequence.b(localp);
    return localp;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public final void b(l paraml)
  {
    Iterator localIterator = this.Iw.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      l locall = (l)localWeakReference.get();
      if ((locall == null) || (locall == paraml)) {
        this.Iw.remove(localWeakReference);
      }
    }
  }
  
  boolean b(f paramf, MenuItem paramMenuItem)
  {
    return (this.Ig != null) && (this.Ig.a(paramf, paramMenuItem));
  }
  
  public final void c(Bundle paramBundle)
  {
    Object localObject1 = null;
    int j = size();
    int i = 0;
    while (i < j)
    {
      MenuItem localMenuItem = getItem(i);
      View localView = m.a(localMenuItem);
      Object localObject3 = localObject1;
      if (localView != null)
      {
        localObject3 = localObject1;
        if (localView.getId() != -1)
        {
          Object localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new SparseArray();
          }
          localView.saveHierarchyState((SparseArray)localObject2);
          localObject3 = localObject2;
          if (m.d(localMenuItem))
          {
            paramBundle.putInt("android:menu:expandedactionview", localMenuItem.getItemId());
            localObject3 = localObject2;
          }
        }
      }
      if (localMenuItem.hasSubMenu()) {
        ((p)localMenuItem.getSubMenu()).c(paramBundle);
      }
      i += 1;
      localObject1 = localObject3;
    }
    if (localObject1 != null) {
      paramBundle.putSparseParcelableArray(dG(), (SparseArray)localObject1);
    }
  }
  
  public void clear()
  {
    if (this.Ix != null) {
      h(this.Ix);
    }
    this.bA.clear();
    p(true);
  }
  
  public void clearHeader()
  {
    this.Ip = null;
    this.Io = null;
    this.Iq = null;
    p(false);
  }
  
  public void close()
  {
    J(true);
  }
  
  public final void d(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    do
    {
      int i;
      do
      {
        return;
        SparseArray localSparseArray = paramBundle.getSparseParcelableArray(dG());
        int j = size();
        i = 0;
        while (i < j)
        {
          MenuItem localMenuItem = getItem(i);
          View localView = m.a(localMenuItem);
          if ((localView != null) && (localView.getId() != -1)) {
            localView.restoreHierarchyState(localSparseArray);
          }
          if (localMenuItem.hasSubMenu()) {
            ((p)localMenuItem.getSubMenu()).d(paramBundle);
          }
          i += 1;
        }
        i = paramBundle.getInt("android:menu:expandedactionview");
      } while (i <= 0);
      paramBundle = findItem(i);
    } while (paramBundle == null);
    m.b(paramBundle);
  }
  
  protected String dG()
  {
    return "android:menu:actionviewstates";
  }
  
  boolean dH()
  {
    return this.Ie;
  }
  
  public boolean dI()
  {
    return this.If;
  }
  
  public final void dJ()
  {
    if (!this.Ir)
    {
      this.Ir = true;
      this.Is = false;
    }
  }
  
  public final void dK()
  {
    this.Ir = false;
    if (this.Is)
    {
      this.Is = false;
      p(true);
    }
  }
  
  final void dL()
  {
    this.Ii = true;
    p(true);
  }
  
  final void dM()
  {
    this.Il = true;
    p(true);
  }
  
  public final ArrayList<h> dN()
  {
    if (!this.Ii) {
      return this.Ih;
    }
    this.Ih.clear();
    int j = this.bA.size();
    int i = 0;
    while (i < j)
    {
      h localh = (h)this.bA.get(i);
      if (localh.isVisible()) {
        this.Ih.add(localh);
      }
      i += 1;
    }
    this.Ii = false;
    this.Il = true;
    return this.Ih;
  }
  
  public final void dO()
  {
    ArrayList localArrayList = dN();
    if (!this.Il) {
      return;
    }
    Object localObject = this.Iw.iterator();
    int i = 0;
    while (((Iterator)localObject).hasNext())
    {
      WeakReference localWeakReference = (WeakReference)((Iterator)localObject).next();
      l locall = (l)localWeakReference.get();
      if (locall == null) {
        this.Iw.remove(localWeakReference);
      } else {
        i = locall.N() | i;
      }
    }
    if (i != 0)
    {
      this.Ij.clear();
      this.Ik.clear();
      int k = localArrayList.size();
      i = 0;
      if (i < k)
      {
        localObject = (h)localArrayList.get(i);
        if (((h)localObject).dV()) {
          this.Ij.add(localObject);
        }
        for (;;)
        {
          int j;
          i += 1;
          break;
          this.Ik.add(localObject);
        }
      }
    }
    else
    {
      this.Ij.clear();
      this.Ik.clear();
      this.Ik.addAll(dN());
    }
    this.Il = false;
  }
  
  public final ArrayList<h> dP()
  {
    dO();
    return this.Ik;
  }
  
  public f dQ()
  {
    return this;
  }
  
  public final void dispatchSaveInstanceState(Bundle paramBundle)
  {
    if (this.Iw.isEmpty()) {
      return;
    }
    SparseArray localSparseArray = new SparseArray();
    Iterator localIterator = this.Iw.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (WeakReference)localIterator.next();
      l locall = (l)((WeakReference)localObject).get();
      if (locall == null)
      {
        this.Iw.remove(localObject);
      }
      else
      {
        int i = locall.getId();
        if (i > 0)
        {
          localObject = locall.onSaveInstanceState();
          if (localObject != null) {
            localSparseArray.put(i, localObject);
          }
        }
      }
    }
    paramBundle.putSparseParcelableArray("android:menu:presenters", localSparseArray);
  }
  
  public MenuItem findItem(int paramInt)
  {
    int j = size();
    int i = 0;
    while (i < j)
    {
      Object localObject = (h)this.bA.get(i);
      if (((h)localObject).getItemId() == paramInt) {}
      MenuItem localMenuItem;
      do
      {
        return (MenuItem)localObject;
        if (!((h)localObject).hasSubMenu()) {
          break;
        }
        localMenuItem = ((h)localObject).getSubMenu().findItem(paramInt);
        localObject = localMenuItem;
      } while (localMenuItem != null);
      i += 1;
    }
    return null;
  }
  
  protected final f g(CharSequence paramCharSequence)
  {
    a(paramCharSequence, null, null);
    return this;
  }
  
  public boolean g(h paramh)
  {
    boolean bool2 = false;
    if (this.Iw.isEmpty()) {
      return bool2;
    }
    dJ();
    Iterator localIterator = this.Iw.iterator();
    boolean bool1 = false;
    for (;;)
    {
      label29:
      if (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        l locall = (l)localWeakReference.get();
        if (locall == null)
        {
          this.Iw.remove(localWeakReference);
        }
        else
        {
          bool1 = locall.b(paramh);
          if (!bool1) {
            break;
          }
        }
      }
    }
    for (;;)
    {
      dK();
      bool2 = bool1;
      if (!bool1) {
        break;
      }
      this.Ix = paramh;
      return bool1;
      break label29;
    }
  }
  
  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.bA.get(paramInt);
  }
  
  public boolean h(h paramh)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (!this.Iw.isEmpty())
    {
      if (this.Ix != paramh) {
        bool2 = bool1;
      }
    }
    else {
      return bool2;
    }
    dJ();
    Iterator localIterator = this.Iw.iterator();
    bool1 = false;
    for (;;)
    {
      label41:
      if (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        l locall = (l)localWeakReference.get();
        if (locall == null)
        {
          this.Iw.remove(localWeakReference);
        }
        else
        {
          bool1 = locall.c(paramh);
          if (!bool1) {
            break;
          }
        }
      }
    }
    for (;;)
    {
      dK();
      bool2 = bool1;
      if (!bool1) {
        break;
      }
      this.Ix = null;
      return bool1;
      break label41;
    }
  }
  
  public boolean hasVisibleItems()
  {
    if (this.Iy) {
      return true;
    }
    int j = size();
    int i = 0;
    while (i < j)
    {
      if (((h)this.bA.get(i)).isVisible()) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return a(paramInt, paramKeyEvent) != null;
  }
  
  protected final f k(Drawable paramDrawable)
  {
    a(null, paramDrawable, null);
    return this;
  }
  
  public void p(boolean paramBoolean)
  {
    if (!this.Ir)
    {
      if (paramBoolean)
      {
        this.Ii = true;
        this.Il = true;
      }
      if (!this.Iw.isEmpty())
      {
        dJ();
        Iterator localIterator = this.Iw.iterator();
        while (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          l locall = (l)localWeakReference.get();
          if (locall == null) {
            this.Iw.remove(localWeakReference);
          } else {
            locall.n(paramBoolean);
          }
        }
        dK();
      }
      return;
    }
    this.Is = true;
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return a(findItem(paramInt1), null, paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    paramKeyEvent = a(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (paramKeyEvent != null) {
      bool = a(paramKeyEvent, null, paramInt2);
    }
    if ((paramInt2 & 0x2) != 0) {
      J(true);
    }
    return bool;
  }
  
  public void removeGroup(int paramInt)
  {
    int j = size();
    int i = 0;
    if (i < j) {
      if (((h)this.bA.get(i)).getGroupId() != paramInt) {}
    }
    for (;;)
    {
      label30:
      if (i >= 0)
      {
        int k = this.bA.size();
        j = 0;
        for (;;)
        {
          if ((j < k - i) && (((h)this.bA.get(i)).getGroupId() == paramInt))
          {
            m(i, false);
            j += 1;
            continue;
            i += 1;
            break;
            i = -1;
            break label30;
          }
        }
        p(true);
      }
    }
  }
  
  public void removeItem(int paramInt)
  {
    int j = size();
    int i = 0;
    if (i < j) {
      if (((h)this.bA.get(i)).getItemId() != paramInt) {}
    }
    for (;;)
    {
      m(i, true);
      return;
      i += 1;
      break;
      i = -1;
    }
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = this.bA.size();
    int i = 0;
    while (i < j)
    {
      h localh = (h)this.bA.get(i);
      if (localh.getGroupId() == paramInt)
      {
        localh.K(paramBoolean2);
        localh.setCheckable(paramBoolean1);
      }
      i += 1;
    }
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int j = this.bA.size();
    int i = 0;
    while (i < j)
    {
      h localh = (h)this.bA.get(i);
      if (localh.getGroupId() == paramInt) {
        localh.setEnabled(paramBoolean);
      }
      i += 1;
    }
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int k = this.bA.size();
    int j = 0;
    int i = 0;
    if (j < k)
    {
      h localh = (h)this.bA.get(j);
      if ((localh.getGroupId() != paramInt) || (!localh.M(paramBoolean))) {
        break label74;
      }
      i = 1;
    }
    label74:
    for (;;)
    {
      j += 1;
      break;
      if (i != 0) {
        p(true);
      }
      return;
    }
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    this.Ie = paramBoolean;
    p(false);
  }
  
  public int size()
  {
    return this.bA.size();
  }
  
  public static abstract interface a
  {
    public abstract boolean a(f paramf, MenuItem paramMenuItem);
    
    public abstract void b(f paramf);
  }
  
  public static abstract interface b
  {
    public abstract boolean f(h paramh);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */