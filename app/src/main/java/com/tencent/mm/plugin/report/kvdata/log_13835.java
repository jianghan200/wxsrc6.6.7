package com.tencent.mm.plugin.report.kvdata;

import f.a.a.b;
import java.util.LinkedList;

public class log_13835
  extends com.tencent.mm.bk.a
{
  public int clientVersion_;
  public String currChatName_;
  public int device_;
  public int ds_;
  public int import_ds_;
  public LinkedList<IMBehavior> oplist_ = new LinkedList();
  public long time_stamp_;
  public long uin_;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.currChatName_ == null) {
        throw new b("Not all required fields were included: currChatName_");
      }
      paramVarArgs.fT(1, this.import_ds_);
      paramVarArgs.fT(2, this.ds_);
      paramVarArgs.T(3, this.uin_);
      paramVarArgs.fT(4, this.device_);
      paramVarArgs.fT(5, this.clientVersion_);
      paramVarArgs.T(6, this.time_stamp_);
      if (this.currChatName_ != null) {
        paramVarArgs.g(7, this.currChatName_);
      }
      paramVarArgs.d(8, 8, this.oplist_);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.import_ds_) + 0 + f.a.a.a.fQ(2, this.ds_) + f.a.a.a.S(3, this.uin_) + f.a.a.a.fQ(4, this.device_) + f.a.a.a.fQ(5, this.clientVersion_) + f.a.a.a.S(6, this.time_stamp_);
      paramInt = i;
      if (this.currChatName_ != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.currChatName_);
      }
      return paramInt + f.a.a.a.c(8, 8, this.oplist_);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.oplist_.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.currChatName_ == null) {
        throw new b("Not all required fields were included: currChatName_");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      log_13835 locallog_13835 = (log_13835)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        locallog_13835.import_ds_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        locallog_13835.ds_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        locallog_13835.uin_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 4: 
        locallog_13835.device_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        locallog_13835.clientVersion_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        locallog_13835.time_stamp_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 7: 
        locallog_13835.currChatName_ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new IMBehavior();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((IMBehavior)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        locallog_13835.oplist_.add(localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/log_13835.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */