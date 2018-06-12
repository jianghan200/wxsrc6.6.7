package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bcc
  extends bhp
{
  public int kpF;
  public int kpG;
  public int kpH;
  public com.tencent.mm.bk.b kpI;
  public int kpK;
  public int kpN;
  public int kpu;
  public String kpv;
  public int kpz;
  public LinkedList<bbu> rfi = new LinkedList();
  public int rxG;
  public long rxH;
  public long seh;
  public int seq;
  public int ser;
  public LinkedList<bbu> ses = new LinkedList();
  public String set;
  public com.tencent.mm.bk.b seu;
  public int sev;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rxG);
      paramVarArgs.T(3, this.rxH);
      paramVarArgs.fT(4, this.seq);
      paramVarArgs.d(5, 8, this.rfi);
      paramVarArgs.fT(6, this.ser);
      paramVarArgs.fT(7, this.kpF);
      paramVarArgs.fT(8, this.kpG);
      paramVarArgs.T(9, this.seh);
      paramVarArgs.fT(10, this.kpH);
      if (this.kpI != null) {
        paramVarArgs.b(11, this.kpI);
      }
      paramVarArgs.fT(12, this.kpz);
      paramVarArgs.fT(13, this.kpu);
      if (this.kpv != null) {
        paramVarArgs.g(14, this.kpv);
      }
      paramVarArgs.fT(15, this.kpK);
      paramVarArgs.d(16, 8, this.ses);
      paramVarArgs.fT(17, this.kpN);
      if (this.set != null) {
        paramVarArgs.g(18, this.set);
      }
      if (this.seu != null) {
        paramVarArgs.b(19, this.seu);
      }
      paramVarArgs.fT(20, this.sev);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1300;
      }
    }
    label1300:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rxG) + f.a.a.a.S(3, this.rxH) + f.a.a.a.fQ(4, this.seq) + f.a.a.a.c(5, 8, this.rfi) + f.a.a.a.fQ(6, this.ser) + f.a.a.a.fQ(7, this.kpF) + f.a.a.a.fQ(8, this.kpG) + f.a.a.a.S(9, this.seh) + f.a.a.a.fQ(10, this.kpH);
      paramInt = i;
      if (this.kpI != null) {
        paramInt = i + f.a.a.a.a(11, this.kpI);
      }
      i = paramInt + f.a.a.a.fQ(12, this.kpz) + f.a.a.a.fQ(13, this.kpu);
      paramInt = i;
      if (this.kpv != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.kpv);
      }
      i = paramInt + f.a.a.a.fQ(15, this.kpK) + f.a.a.a.c(16, 8, this.ses) + f.a.a.a.fQ(17, this.kpN);
      paramInt = i;
      if (this.set != null) {
        paramInt = i + f.a.a.b.b.a.h(18, this.set);
      }
      i = paramInt;
      if (this.seu != null) {
        i = paramInt + f.a.a.a.a(19, this.seu);
      }
      return i + f.a.a.a.fQ(20, this.sev);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rfi.clear();
        this.ses.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bcc localbcc = (bcc)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbcc.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbcc.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbcc.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localbcc.seq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bbu();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bbu)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbcc.rfi.add(localObject1);
            paramInt += 1;
          }
        case 6: 
          localbcc.ser = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbcc.kpF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbcc.kpG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbcc.seh = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 10: 
          localbcc.kpH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localbcc.kpI = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 12: 
          localbcc.kpz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localbcc.kpu = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localbcc.kpv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 15: 
          localbcc.kpK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bbu();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bbu)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbcc.ses.add(localObject1);
            paramInt += 1;
          }
        case 17: 
          localbcc.kpN = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localbcc.set = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 19: 
          localbcc.seu = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        }
        localbcc.sev = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bcc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */