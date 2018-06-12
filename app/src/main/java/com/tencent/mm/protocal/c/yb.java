package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class yb
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public LinkedList<xv> rDS = new LinkedList();
  public LinkedList<yd> rDT = new LinkedList();
  public String rDU;
  public String rDV;
  public LinkedList<yc> rDW = new LinkedList();
  public int rDX;
  public boolean rDY;
  public int type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      paramVarArgs.fT(2, this.type);
      paramVarArgs.d(3, 8, this.rDS);
      paramVarArgs.d(4, 8, this.rDT);
      if (this.rDU != null) {
        paramVarArgs.g(5, this.rDU);
      }
      if (this.rDV != null) {
        paramVarArgs.g(6, this.rDV);
      }
      paramVarArgs.d(7, 8, this.rDW);
      paramVarArgs.fT(8, this.rDX);
      paramVarArgs.av(9, this.rDY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label798;
      }
    }
    label798:
    for (paramInt = f.a.a.b.b.a.h(1, this.bHD) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.type) + f.a.a.a.c(3, 8, this.rDS) + f.a.a.a.c(4, 8, this.rDT);
      paramInt = i;
      if (this.rDU != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rDU);
      }
      i = paramInt;
      if (this.rDV != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rDV);
      }
      return i + f.a.a.a.c(7, 8, this.rDW) + f.a.a.a.fQ(8, this.rDX) + (f.a.a.b.b.a.ec(9) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rDS.clear();
        this.rDT.clear();
        this.rDW.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        yb localyb = (yb)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localyb.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localyb.type = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new xv();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localyb.rDS.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new yd();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((yd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localyb.rDT.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localyb.rDU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localyb.rDV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new yc();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((yc)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localyb.rDW.add(localObject1);
            paramInt += 1;
          }
        case 8: 
          localyb.rDX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localyb.rDY = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/yb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */