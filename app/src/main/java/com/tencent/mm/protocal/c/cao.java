package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cao
  extends bhd
{
  public LinkedList<bqo> rIv = new LinkedList();
  public double rji;
  public double rjj;
  public int rth;
  public int rxG;
  public long rxH;
  public long swW;
  public bhz swX;
  public bhz swY;
  public int swZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.swX == null) {
        throw new b("Not all required fields were included: NetName");
      }
      if (this.swY == null) {
        throw new b("Not all required fields were included: WifiName");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.T(2, this.swW);
      paramVarArgs.T(3, this.rxH);
      paramVarArgs.fT(4, this.rth);
      if (this.swX != null)
      {
        paramVarArgs.fV(5, this.swX.boi());
        this.swX.a(paramVarArgs);
      }
      if (this.swY != null)
      {
        paramVarArgs.fV(6, this.swY.boi());
        this.swY.a(paramVarArgs);
      }
      paramVarArgs.c(7, this.rji);
      paramVarArgs.c(8, this.rjj);
      paramVarArgs.fT(9, this.rxG);
      paramVarArgs.fT(10, this.swZ);
      paramVarArgs.d(11, 8, this.rIv);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1037;
      }
    }
    label1037:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.swW) + f.a.a.a.S(3, this.rxH) + f.a.a.a.fQ(4, this.rth);
      paramInt = i;
      if (this.swX != null) {
        paramInt = i + f.a.a.a.fS(5, this.swX.boi());
      }
      i = paramInt;
      if (this.swY != null) {
        i = paramInt + f.a.a.a.fS(6, this.swY.boi());
      }
      return i + (f.a.a.b.b.a.ec(7) + 8) + (f.a.a.b.b.a.ec(8) + 8) + f.a.a.a.fQ(9, this.rxG) + f.a.a.a.fQ(10, this.swZ) + f.a.a.a.c(11, 8, this.rIv);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rIv.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.swX == null) {
          throw new b("Not all required fields were included: NetName");
        }
        if (this.swY != null) {
          break;
        }
        throw new b("Not all required fields were included: WifiName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cao localcao = (cao)paramVarArgs[1];
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
            localcao.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcao.swW = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 3: 
          localcao.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localcao.rth = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcao.swX = ((bhz)localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcao.swY = ((bhz)localObject1);
            paramInt += 1;
          }
        case 7: 
          localcao.rji = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 8: 
          localcao.rjj = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        case 9: 
          localcao.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localcao.swZ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqo();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localcao.rIv.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/cao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */