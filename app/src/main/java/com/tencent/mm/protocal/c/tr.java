package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class tr
  extends com.tencent.mm.bk.a
{
  public int rbZ;
  public String rxq;
  public String rxr;
  public String rxs;
  public String rxt;
  public String rxu;
  public int rxv;
  public int rxw;
  public String rxx;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rxq == null) {
        throw new b("Not all required fields were included: BegWord");
      }
      if (this.rxr == null) {
        throw new b("Not all required fields were included: BegPicUrl");
      }
      if (this.rxs == null) {
        throw new b("Not all required fields were included: ThanksPicUrl");
      }
      if (this.rxq != null) {
        paramVarArgs.g(1, this.rxq);
      }
      if (this.rxr != null) {
        paramVarArgs.g(2, this.rxr);
      }
      if (this.rxs != null) {
        paramVarArgs.g(3, this.rxs);
      }
      if (this.rxt != null) {
        paramVarArgs.g(4, this.rxt);
      }
      if (this.rxu != null) {
        paramVarArgs.g(5, this.rxu);
      }
      paramVarArgs.fT(6, this.rxv);
      paramVarArgs.fT(7, this.rxw);
      if (this.rxx != null) {
        paramVarArgs.g(8, this.rxx);
      }
      paramVarArgs.fT(9, this.rbZ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rxq == null) {
        break label675;
      }
    }
    label675:
    for (int i = f.a.a.b.b.a.h(1, this.rxq) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rxr != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rxr);
      }
      i = paramInt;
      if (this.rxs != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rxs);
      }
      paramInt = i;
      if (this.rxt != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rxt);
      }
      i = paramInt;
      if (this.rxu != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rxu);
      }
      i = i + f.a.a.a.fQ(6, this.rxv) + f.a.a.a.fQ(7, this.rxw);
      paramInt = i;
      if (this.rxx != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rxx);
      }
      return paramInt + f.a.a.a.fQ(9, this.rbZ);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rxq == null) {
          throw new b("Not all required fields were included: BegWord");
        }
        if (this.rxr == null) {
          throw new b("Not all required fields were included: BegPicUrl");
        }
        if (this.rxs != null) {
          break;
        }
        throw new b("Not all required fields were included: ThanksPicUrl");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        tr localtr = (tr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localtr.rxq = locala.vHC.readString();
          return 0;
        case 2: 
          localtr.rxr = locala.vHC.readString();
          return 0;
        case 3: 
          localtr.rxs = locala.vHC.readString();
          return 0;
        case 4: 
          localtr.rxt = locala.vHC.readString();
          return 0;
        case 5: 
          localtr.rxu = locala.vHC.readString();
          return 0;
        case 6: 
          localtr.rxv = locala.vHC.rY();
          return 0;
        case 7: 
          localtr.rxw = locala.vHC.rY();
          return 0;
        case 8: 
          localtr.rxx = locala.vHC.readString();
          return 0;
        }
        localtr.rbZ = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/tr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */