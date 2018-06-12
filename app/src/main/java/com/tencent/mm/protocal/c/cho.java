package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cho
  extends com.tencent.mm.bk.a
{
  public int riv;
  public String rwk;
  public int sBF;
  public boolean sBG;
  public chl sBu;
  public int sil;
  public int sin;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sBu != null)
      {
        paramVarArgs.fV(1, this.sBu.boi());
        this.sBu.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.sBF);
      paramVarArgs.fT(3, this.sil);
      paramVarArgs.fT(4, this.sin);
      paramVarArgs.av(5, this.sBG);
      paramVarArgs.fT(6, this.riv);
      if (this.rwk != null) {
        paramVarArgs.g(7, this.rwk);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sBu == null) {
        break label512;
      }
    }
    label512:
    for (paramInt = f.a.a.a.fS(1, this.sBu.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.sBF) + f.a.a.a.fQ(3, this.sil) + f.a.a.a.fQ(4, this.sin) + (f.a.a.b.b.a.ec(5) + 1) + f.a.a.a.fQ(6, this.riv);
      paramInt = i;
      if (this.rwk != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rwk);
      }
      return paramInt;
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
        cho localcho = (cho)paramVarArgs[1];
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
            localObject1 = new chl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((chl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcho.sBu = ((chl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcho.sBF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localcho.sil = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localcho.sin = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localcho.sBG = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 6: 
          localcho.riv = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localcho.rwk = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */