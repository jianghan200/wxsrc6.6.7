package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bhu
  extends bhd
{
  public String jTu;
  public String jTv;
  public int lOH;
  public String rdo;
  public int siB;
  public int siC;
  public int siD;
  public long siE;
  
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
      if (this.rdo != null) {
        paramVarArgs.g(2, this.rdo);
      }
      paramVarArgs.fT(3, this.siB);
      paramVarArgs.fT(4, this.lOH);
      paramVarArgs.fT(5, this.siC);
      if (this.jTv != null) {
        paramVarArgs.g(6, this.jTv);
      }
      if (this.jTu != null) {
        paramVarArgs.g(7, this.jTu);
      }
      paramVarArgs.fT(8, this.siD);
      paramVarArgs.T(9, this.siE);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label633;
      }
    }
    label633:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rdo != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rdo);
      }
      i = i + f.a.a.a.fQ(3, this.siB) + f.a.a.a.fQ(4, this.lOH) + f.a.a.a.fQ(5, this.siC);
      paramInt = i;
      if (this.jTv != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.jTv);
      }
      i = paramInt;
      if (this.jTu != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.jTu);
      }
      return i + f.a.a.a.fQ(8, this.siD) + f.a.a.a.S(9, this.siE);
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
        bhu localbhu = (bhu)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbhu.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbhu.rdo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbhu.siB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbhu.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbhu.siC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbhu.jTv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbhu.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbhu.siD = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbhu.siE = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bhu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */