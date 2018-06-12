package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class abv
  extends com.tencent.mm.bk.a
{
  public String rGo;
  public ma rGr;
  public String rGs;
  public boolean rGt;
  public int rGu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rGr != null)
      {
        paramVarArgs.fV(1, this.rGr.boi());
        this.rGr.a(paramVarArgs);
      }
      if (this.rGo != null) {
        paramVarArgs.g(2, this.rGo);
      }
      if (this.rGs != null) {
        paramVarArgs.g(3, this.rGs);
      }
      paramVarArgs.av(4, this.rGt);
      paramVarArgs.fT(5, this.rGu);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rGr == null) {
        break label450;
      }
    }
    label450:
    for (int i = f.a.a.a.fS(1, this.rGr.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rGo != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rGo);
      }
      i = paramInt;
      if (this.rGs != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rGs);
      }
      return i + (f.a.a.b.b.a.ec(4) + 1) + f.a.a.a.fQ(5, this.rGu);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        abv localabv = (abv)paramVarArgs[1];
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
            localObject1 = new ma();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ma)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localabv.rGr = ((ma)localObject1);
            paramInt += 1;
          }
        case 2: 
          localabv.rGo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localabv.rGs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localabv.rGt = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        }
        localabv.rGu = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/abv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */