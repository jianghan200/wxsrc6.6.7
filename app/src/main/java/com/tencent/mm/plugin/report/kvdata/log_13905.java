package com.tencent.mm.plugin.report.kvdata;

import f.a.a.b;
import java.util.LinkedList;

public class log_13905
  extends com.tencent.mm.bk.a
{
  public int clientVersion_;
  public int device_;
  public int ds_;
  public int import_ds_;
  public long time_stamp_;
  public long uin_;
  public VoiceInputBehavior viOp_;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.viOp_ == null) {
        throw new b("Not all required fields were included: viOp_");
      }
      paramVarArgs.fT(1, this.import_ds_);
      paramVarArgs.fT(2, this.ds_);
      paramVarArgs.T(3, this.uin_);
      paramVarArgs.fT(4, this.device_);
      paramVarArgs.fT(5, this.clientVersion_);
      paramVarArgs.T(6, this.time_stamp_);
      if (this.viOp_ != null)
      {
        paramVarArgs.fV(7, this.viOp_.boi());
        this.viOp_.a(paramVarArgs);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.import_ds_) + 0 + f.a.a.a.fQ(2, this.ds_) + f.a.a.a.S(3, this.uin_) + f.a.a.a.fQ(4, this.device_) + f.a.a.a.fQ(5, this.clientVersion_) + f.a.a.a.S(6, this.time_stamp_);
      paramInt = i;
    } while (this.viOp_ == null);
    return i + f.a.a.a.fS(7, this.viOp_.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.viOp_ == null) {
        throw new b("Not all required fields were included: viOp_");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      log_13905 locallog_13905 = (log_13905)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        locallog_13905.import_ds_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        locallog_13905.ds_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        locallog_13905.uin_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 4: 
        locallog_13905.device_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        locallog_13905.clientVersion_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        locallog_13905.time_stamp_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new VoiceInputBehavior();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((VoiceInputBehavior)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        locallog_13905.viOp_ = ((VoiceInputBehavior)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/log_13905.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */