package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class os
  extends bhd
{
  public String hbL;
  public String jQb;
  public String jTx;
  public String onE;
  public String onF;
  public int rcd;
  public String rhq;
  public aw rmQ;
  public String rrC;
  public int rsA;
  public int rsC;
  public String rsD;
  public int rsW;
  public int rsX;
  public String rsw;
  public String rsx;
  public String rsy;
  public String rsz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      if (this.rsw != null) {
        paramVarArgs.g(3, this.rsw);
      }
      if (this.rhq != null) {
        paramVarArgs.g(4, this.rhq);
      }
      if (this.rsx != null) {
        paramVarArgs.g(5, this.rsx);
      }
      if (this.rsy != null) {
        paramVarArgs.g(6, this.rsy);
      }
      if (this.rsz != null) {
        paramVarArgs.g(7, this.rsz);
      }
      if (this.rrC != null) {
        paramVarArgs.g(8, this.rrC);
      }
      paramVarArgs.fT(9, this.rsA);
      if (this.rmQ != null)
      {
        paramVarArgs.fV(10, this.rmQ.boi());
        this.rmQ.a(paramVarArgs);
      }
      if (this.hbL != null) {
        paramVarArgs.g(11, this.hbL);
      }
      if (this.jTx != null) {
        paramVarArgs.g(12, this.jTx);
      }
      paramVarArgs.fT(13, this.rcd);
      paramVarArgs.fT(14, this.rsW);
      if (this.onE != null) {
        paramVarArgs.g(15, this.onE);
      }
      if (this.onF != null) {
        paramVarArgs.g(16, this.onF);
      }
      paramVarArgs.fT(17, this.rsX);
      paramVarArgs.fT(18, this.rsC);
      if (this.rsD != null) {
        paramVarArgs.g(19, this.rsD);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1297;
      }
    }
    label1297:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = paramInt;
      if (this.rsw != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rsw);
      }
      paramInt = i;
      if (this.rhq != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rhq);
      }
      i = paramInt;
      if (this.rsx != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rsx);
      }
      paramInt = i;
      if (this.rsy != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rsy);
      }
      i = paramInt;
      if (this.rsz != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rsz);
      }
      paramInt = i;
      if (this.rrC != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rrC);
      }
      i = paramInt + f.a.a.a.fQ(9, this.rsA);
      paramInt = i;
      if (this.rmQ != null) {
        paramInt = i + f.a.a.a.fS(10, this.rmQ.boi());
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.hbL);
      }
      paramInt = i;
      if (this.jTx != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.jTx);
      }
      i = paramInt + f.a.a.a.fQ(13, this.rcd) + f.a.a.a.fQ(14, this.rsW);
      paramInt = i;
      if (this.onE != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.onE);
      }
      i = paramInt;
      if (this.onF != null) {
        i = paramInt + f.a.a.b.b.a.h(16, this.onF);
      }
      i = i + f.a.a.a.fQ(17, this.rsX) + f.a.a.a.fQ(18, this.rsC);
      paramInt = i;
      if (this.rsD != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.rsD);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        os localos = (os)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localos.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localos.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localos.rsw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localos.rhq = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localos.rsx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localos.rsy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localos.rsz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localos.rrC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localos.rsA = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localos.rmQ = ((aw)localObject1);
            paramInt += 1;
          }
        case 11: 
          localos.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localos.jTx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localos.rcd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localos.rsW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 15: 
          localos.onE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 16: 
          localos.onF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localos.rsX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localos.rsC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localos.rsD = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/os.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */