package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bci
  extends bhd
{
  public int hcd;
  public String jTv;
  public int rxG;
  public long rxH;
  public long see;
  public long seh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jTv == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.jTv != null) {
        paramVarArgs.g(2, this.jTv);
      }
      paramVarArgs.fT(3, this.rxG);
      paramVarArgs.T(4, this.rxH);
      paramVarArgs.T(5, this.see);
      paramVarArgs.T(6, this.seh);
      paramVarArgs.fT(7, this.hcd);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label551;
      }
    }
    label551:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jTv != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jTv);
      }
      return i + f.a.a.a.fQ(3, this.rxG) + f.a.a.a.S(4, this.rxH) + f.a.a.a.S(5, this.see) + f.a.a.a.S(6, this.seh) + f.a.a.a.fQ(7, this.hcd);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.jTv != null) {
          break;
        }
        throw new b("Not all required fields were included: FromUserName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bci localbci = (bci)paramVarArgs[1];
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
            localbci.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbci.jTv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbci.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbci.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          localbci.see = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 6: 
          localbci.seh = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        }
        localbci.hcd = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */