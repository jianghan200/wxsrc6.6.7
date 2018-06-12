package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class abl
  extends bhd
{
  public int cae;
  public String qZN;
  public String qZO;
  public int qZP;
  public LinkedList<ky> qZS = new LinkedList();
  public String rGk;
  public String rGl;
  public String rcN;
  public String sign;
  
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
      paramVarArgs.d(2, 8, this.qZS);
      paramVarArgs.fT(3, this.cae);
      if (this.rGl != null) {
        paramVarArgs.g(4, this.rGl);
      }
      if (this.rcN != null) {
        paramVarArgs.g(5, this.rcN);
      }
      if (this.sign != null) {
        paramVarArgs.g(6, this.sign);
      }
      if (this.qZN != null) {
        paramVarArgs.g(7, this.qZN);
      }
      if (this.qZO != null) {
        paramVarArgs.g(8, this.qZO);
      }
      if (this.rGk != null) {
        paramVarArgs.g(9, this.rGk);
      }
      paramVarArgs.fT(10, this.qZP);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label818;
      }
    }
    label818:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 8, this.qZS) + f.a.a.a.fQ(3, this.cae);
      paramInt = i;
      if (this.rGl != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rGl);
      }
      i = paramInt;
      if (this.rcN != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rcN);
      }
      paramInt = i;
      if (this.sign != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.sign);
      }
      i = paramInt;
      if (this.qZN != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.qZN);
      }
      paramInt = i;
      if (this.qZO != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.qZO);
      }
      i = paramInt;
      if (this.rGk != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rGk);
      }
      return i + f.a.a.a.fQ(10, this.qZP);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.qZS.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        abl localabl = (abl)paramVarArgs[1];
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
            localabl.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ky();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ky)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localabl.qZS.add(localObject1);
            paramInt += 1;
          }
        case 3: 
          localabl.cae = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localabl.rGl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localabl.rcN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localabl.sign = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localabl.qZN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localabl.qZO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localabl.rGk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localabl.qZP = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/abl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */