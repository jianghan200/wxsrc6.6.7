package com.tencent.sqlitelint.behaviour.alert;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.sqlitelint.behaviour.a.a;
import com.tencent.sqlitelint.behaviour.a.c;
import com.tencent.sqlitelint.d.b;
import com.tencent.sqlitelint.d.c;
import com.tencent.sqlitelint.d.d;
import com.tencent.sqlitelint.util.SLog;
import com.tencent.sqlitelint.util.SQLiteLintUtil;
import java.util.List;

public class CheckedDatabaseListActivity
  extends SQLiteLintBaseActivity
{
  private ListView CU;
  private a vnE;
  
  protected final int getLayoutId()
  {
    return d.c.activity_checked_database_list;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    c.vnS.initialize(this);
    setTitle(getString(d.d.checked_database_list_title));
    this.CU = ((ListView)findViewById(d.b.list));
    this.vnE = new a(this);
    this.CU.setAdapter(this.vnE);
    this.CU.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        paramAnonymousAdapterView = (String)paramAnonymousAdapterView.getItemAtPosition(paramAnonymousInt);
        if (SQLiteLintUtil.oW(paramAnonymousAdapterView)) {
          return;
        }
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(CheckedDatabaseListActivity.this, CheckResultActivity.class);
        paramAnonymousView.putExtra("db_label", paramAnonymousAdapterView);
        CheckedDatabaseListActivity.this.startActivity(paramAnonymousView);
      }
    });
  }
  
  protected void onResume()
  {
    super.onResume();
    List localList = a.cGh();
    SLog.i("SQLiteLint.CheckedDatabaseListActivity", "refreshView defectiveDbList is %d", new Object[] { Integer.valueOf(localList.size()) });
    a locala = this.vnE;
    locala.vnG = localList;
    locala.notifyDataSetChanged();
  }
  
  private static final class a
    extends BaseAdapter
  {
    private final LayoutInflater Bc;
    List<String> vnG;
    
    a(Context paramContext)
    {
      this.Bc = LayoutInflater.from(paramContext);
    }
    
    private String jl(int paramInt)
    {
      return (String)this.vnG.get(paramInt);
    }
    
    public final int getCount()
    {
      if (this.vnG == null) {
        return 0;
      }
      return this.vnG.size();
    }
    
    public final long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null)
      {
        paramView = this.Bc.inflate(d.c.view_checked_database_item, paramViewGroup, false);
        paramViewGroup = new CheckedDatabaseListActivity.b();
        paramViewGroup.vnH = ((TextView)paramView.findViewById(d.b.db_path));
        paramView.setTag(paramViewGroup);
      }
      for (;;)
      {
        String str = jl(paramInt);
        paramViewGroup.vnH.setText(str);
        return paramView;
        paramViewGroup = (CheckedDatabaseListActivity.b)paramView.getTag();
      }
    }
  }
  
  static final class b
  {
    public TextView vnH;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/behaviour/alert/CheckedDatabaseListActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */