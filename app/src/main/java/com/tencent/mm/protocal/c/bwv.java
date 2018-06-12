package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bwv
  extends bhd
{
  public String jTu;
  public String jTv;
  public int rVw;
  public int rci;
  public String rco;
  public long rcq;
  public String rdo;
  public int rgC;
  public int rjC;
  public bhy rtW;
  public int rvV;
  public int rvX;
  public int rvY;
  public int rwB;
  public int sth;
  public int sti;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.jTv != null) {
        paramVarArgs.g(1, this.jTv);
      }
      if (this.jTu != null) {
        paramVarArgs.g(2, this.jTu);
      }
      paramVarArgs.fT(3, this.rjC);
      paramVarArgs.fT(4, this.rvV);
      if (this.rdo != null) {
        paramVarArgs.g(5, this.rdo);
      }
      paramVarArgs.fT(6, this.rci);
      paramVarArgs.fT(7, this.rvX);
      if (this.rtW != null)
      {
        paramVarArgs.fV(8, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      paramVarArgs.fT(9, this.rgC);
      if (this.shX != null)
      {
        paramVarArgs.fV(10, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(11, this.rvY);
      if (this.rco != null) {
        paramVarArgs.g(12, this.rco);
      }
      paramVarArgs.fT(13, this.rVw);
      paramVarArgs.fT(14, this.sth);
      paramVarArgs.fT(15, this.sti);
      paramVarArgs.T(16, this.rcq);
      paramVarArgs.fT(17, this.rwB);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jTv == null) {
        break label1111;
      }
    }
    label1111:
    for (paramInt = f.a.a.b.b.a.h(1, this.jTv) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jTu != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jTu);
      }
      i = i + f.a.a.a.fQ(3, this.rjC) + f.a.a.a.fQ(4, this.rvV);
      paramInt = i;
      if (this.rdo != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rdo);
      }
      i = paramInt + f.a.a.a.fQ(6, this.rci) + f.a.a.a.fQ(7, this.rvX);
      paramInt = i;
      if (this.rtW != null) {
        paramInt = i + f.a.a.a.fS(8, this.rtW.boi());
      }
      i = paramInt + f.a.a.a.fQ(9, this.rgC);
      paramInt = i;
      if (this.shX != null) {
        paramInt = i + f.a.a.a.fS(10, this.shX.boi());
      }
      i = paramInt + f.a.a.a.fQ(11, this.rvY);
      paramInt = i;
      if (this.rco != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.rco);
      }
      return paramInt + f.a.a.a.fQ(13, this.rVw) + f.a.a.a.fQ(14, this.sth) + f.a.a.a.fQ(15, this.sti) + f.a.a.a.S(16, this.rcq) + f.a.a.a.fQ(17, this.rwB);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rtW != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bwv localbwv = (bwv)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbwv.jTv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbwv.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbwv.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbwv.rvV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbwv.rdo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbwv.rci = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbwv.rvX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwv.rtW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 9: 
          localbwv.rgC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwv.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 11: 
          localbwv.rvY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbwv.rco = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localbwv.rVw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localbwv.sth = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 15: 
          localbwv.sti = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localbwv.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        }
        localbwv.rwB = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bwv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */