package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.b;
import android.support.v7.a.a.a;
import android.support.v7.a.a.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public final class b
{
  final j CR;
  final Window CS;
  public CharSequence CT;
  public ListView CU;
  public int CV;
  public int CW;
  public int CX;
  public int CY;
  public int CZ;
  public boolean Da = false;
  Button Db;
  CharSequence Dc;
  Message Dd;
  Button De;
  CharSequence Df;
  Message Dg;
  Button Dh;
  CharSequence Di;
  Message Dj;
  NestedScrollView Dk;
  public int Dl = 0;
  TextView Dm;
  public View Dn;
  public ListAdapter Do;
  public int Dp = -1;
  int Dq;
  int Dr;
  public int Ds;
  public int Dt;
  public int Du;
  public int Dv;
  int Dw = 0;
  final View.OnClickListener Dx = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if ((paramAnonymousView == b.this.Db) && (b.this.Dd != null)) {
        paramAnonymousView = Message.obtain(b.this.Dd);
      }
      for (;;)
      {
        if (paramAnonymousView != null) {
          paramAnonymousView.sendToTarget();
        }
        b.this.mHandler.obtainMessage(1, b.this.CR).sendToTarget();
        return;
        if ((paramAnonymousView == b.this.De) && (b.this.Dg != null)) {
          paramAnonymousView = Message.obtain(b.this.Dg);
        } else if ((paramAnonymousView == b.this.Dh) && (b.this.Dj != null)) {
          paramAnonymousView = Message.obtain(b.this.Dj);
        } else {
          paramAnonymousView = null;
        }
      }
    }
  };
  public TextView gH;
  public Drawable hh;
  public ImageView ii;
  public final Context mContext;
  Handler mHandler;
  public View mView;
  CharSequence sn;
  
  public b(Context paramContext, j paramj, Window paramWindow)
  {
    this.mContext = paramContext;
    this.CR = paramj;
    this.CS = paramWindow;
    this.mHandler = new b(paramj);
    paramContext = paramContext.obtainStyledAttributes(null, a.k.AlertDialog, a.a.alertDialogStyle, 0);
    this.Dq = paramContext.getResourceId(a.k.AlertDialog_android_layout, 0);
    this.Dr = paramContext.getResourceId(a.k.AlertDialog_buttonPanelSideLayout, 0);
    this.Ds = paramContext.getResourceId(a.k.AlertDialog_listLayout, 0);
    this.Dt = paramContext.getResourceId(a.k.AlertDialog_multiChoiceItemLayout, 0);
    this.Du = paramContext.getResourceId(a.k.AlertDialog_singleChoiceItemLayout, 0);
    this.Dv = paramContext.getResourceId(a.k.AlertDialog_listItemLayout, 0);
    paramContext.recycle();
    paramj.dm();
  }
  
  static boolean aH(View paramView)
  {
    if (paramView.onCheckIsTextEditor()) {
      return true;
    }
    if (!(paramView instanceof ViewGroup)) {
      return false;
    }
    paramView = (ViewGroup)paramView;
    int i = paramView.getChildCount();
    while (i > 0)
    {
      int j = i - 1;
      i = j;
      if (aH(paramView.getChildAt(j))) {
        return true;
      }
    }
    return false;
  }
  
  static ViewGroup b(View paramView1, View paramView2)
  {
    if (paramView1 == null) {
      if (!(paramView2 instanceof ViewStub)) {
        break label71;
      }
    }
    label71:
    for (paramView1 = ((ViewStub)paramView2).inflate();; paramView1 = paramView2)
    {
      return (ViewGroup)paramView1;
      if (paramView2 != null)
      {
        ViewParent localViewParent = paramView2.getParent();
        if ((localViewParent instanceof ViewGroup)) {
          ((ViewGroup)localViewParent).removeView(paramView2);
        }
      }
      if ((paramView1 instanceof ViewStub)) {
        paramView1 = ((ViewStub)paramView1).inflate();
      }
      for (;;)
      {
        return (ViewGroup)paramView1;
      }
    }
  }
  
  public final void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage)
  {
    if (paramOnClickListener != null) {
      paramMessage = this.mHandler.obtainMessage(paramInt, paramOnClickListener);
    }
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Button does not exist");
    case -1: 
      this.Dc = paramCharSequence;
      this.Dd = paramMessage;
      return;
    case -2: 
      this.Df = paramCharSequence;
      this.Dg = paramMessage;
      return;
    }
    this.Di = paramCharSequence;
    this.Dj = paramMessage;
  }
  
  public final void setIcon(int paramInt)
  {
    this.hh = null;
    this.Dl = paramInt;
    if (this.ii != null)
    {
      if (paramInt != 0)
      {
        this.ii.setVisibility(0);
        this.ii.setImageResource(this.Dl);
      }
    }
    else {
      return;
    }
    this.ii.setVisibility(8);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.sn = paramCharSequence;
    if (this.Dm != null) {
      this.Dm.setText(paramCharSequence);
    }
  }
  
  public static final class a
  {
    public final LayoutInflater Bc;
    public CharSequence CT;
    public int CV;
    public int CW;
    public int CX;
    public int CY;
    public int CZ;
    public int DB = 0;
    public CharSequence DC;
    public DialogInterface.OnClickListener DD;
    public CharSequence DE;
    public DialogInterface.OnClickListener DF;
    public CharSequence DG;
    public DialogInterface.OnClickListener DH;
    public DialogInterface.OnCancelListener DI;
    public DialogInterface.OnDismissListener DJ;
    public DialogInterface.OnKeyListener DK;
    public CharSequence[] DL;
    public DialogInterface.OnClickListener DM;
    public boolean[] DN;
    public boolean DO;
    public boolean DP;
    public DialogInterface.OnMultiChoiceClickListener DQ;
    public String DR;
    public String DS;
    public AdapterView.OnItemSelectedListener DT;
    public boolean DU = true;
    public boolean Da = false;
    public int Dl = 0;
    public View Dn;
    public ListAdapter Do;
    public int Dp = -1;
    public Drawable hh;
    public final Context mContext;
    public View mView;
    public boolean nq;
    public CharSequence sn;
    public Cursor yV;
    
    public a(Context paramContext)
    {
      this.mContext = paramContext;
      this.nq = true;
      this.Bc = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    }
  }
  
  private static final class b
    extends Handler
  {
    private WeakReference<DialogInterface> Ea;
    
    public b(DialogInterface paramDialogInterface)
    {
      this.Ea = new WeakReference(paramDialogInterface);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      case 0: 
      default: 
        return;
      case -3: 
      case -2: 
      case -1: 
        ((DialogInterface.OnClickListener)paramMessage.obj).onClick((DialogInterface)this.Ea.get(), paramMessage.what);
        return;
      }
      ((DialogInterface)paramMessage.obj).dismiss();
    }
  }
  
  private static final class c
    extends ArrayAdapter<CharSequence>
  {
    public c(Context paramContext, int paramInt, CharSequence[] paramArrayOfCharSequence)
    {
      super(paramInt, 16908308, paramArrayOfCharSequence);
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final boolean hasStableIds()
    {
      return true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */