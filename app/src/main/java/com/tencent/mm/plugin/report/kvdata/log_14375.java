package com.tencent.mm.plugin.report.kvdata;

import java.util.LinkedList;

public class log_14375
  extends com.tencent.mm.bk.a
{
  public int clientVersion_;
  public BDStatusInfo dbStatusInfo_;
  public int device_;
  public int ds_;
  public HeavyDetailInfo heavyDetailInfo_;
  public int import_ds_;
  public SDStatusInfo sdStatusInfo_;
  public long time_stamp_;
  public int type_;
  public long uin_;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.import_ds_);
      paramVarArgs.fT(2, this.ds_);
      paramVarArgs.T(3, this.uin_);
      paramVarArgs.fT(4, this.device_);
      paramVarArgs.fT(5, this.clientVersion_);
      paramVarArgs.T(6, this.time_stamp_);
      paramVarArgs.fT(7, this.type_);
      if (this.dbStatusInfo_ != null)
      {
        paramVarArgs.fV(8, this.dbStatusInfo_.boi());
        this.dbStatusInfo_.a(paramVarArgs);
      }
      if (this.sdStatusInfo_ != null)
      {
        paramVarArgs.fV(9, this.sdStatusInfo_.boi());
        this.sdStatusInfo_.a(paramVarArgs);
      }
      if (this.heavyDetailInfo_ != null)
      {
        paramVarArgs.fV(10, this.heavyDetailInfo_.boi());
        this.heavyDetailInfo_.a(paramVarArgs);
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
      i = f.a.a.a.fQ(1, this.import_ds_) + 0 + f.a.a.a.fQ(2, this.ds_) + f.a.a.a.S(3, this.uin_) + f.a.a.a.fQ(4, this.device_) + f.a.a.a.fQ(5, this.clientVersion_) + f.a.a.a.S(6, this.time_stamp_) + f.a.a.a.fQ(7, this.type_);
      paramInt = i;
      if (this.dbStatusInfo_ != null) {
        paramInt = i + f.a.a.a.fS(8, this.dbStatusInfo_.boi());
      }
      i = paramInt;
      if (this.sdStatusInfo_ != null) {
        i = paramInt + f.a.a.a.fS(9, this.sdStatusInfo_.boi());
      }
      paramInt = i;
    } while (this.heavyDetailInfo_ == null);
    return i + f.a.a.a.fS(10, this.heavyDetailInfo_.boi());
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      log_14375 locallog_14375 = (log_14375)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        locallog_14375.import_ds_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        locallog_14375.ds_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        locallog_14375.uin_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 4: 
        locallog_14375.device_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        locallog_14375.clientVersion_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        locallog_14375.time_stamp_ = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 7: 
        locallog_14375.type_ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new BDStatusInfo();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((BDStatusInfo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          locallog_14375.dbStatusInfo_ = ((BDStatusInfo)localObject1);
          paramInt += 1;
        }
        return 0;
      case 9: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new SDStatusInfo();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((SDStatusInfo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          locallog_14375.sdStatusInfo_ = ((SDStatusInfo)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new HeavyDetailInfo();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((HeavyDetailInfo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        locallog_14375.heavyDetailInfo_ = ((HeavyDetailInfo)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/log_14375.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */