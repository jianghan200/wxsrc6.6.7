package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bvi
  extends bhd
{
  public int aAk;
  public int rka;
  public int scene;
  public int srW;
  public int srX;
  public int srY;
  public String srZ;
  public String username;
  
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
      paramVarArgs.fT(2, this.scene);
      paramVarArgs.fT(3, this.srW);
      paramVarArgs.fT(4, this.rka);
      paramVarArgs.fT(5, this.srX);
      paramVarArgs.fT(6, this.srY);
      if (this.username != null) {
        paramVarArgs.g(7, this.username);
      }
      paramVarArgs.fT(8, this.aAk);
      if (this.srZ != null) {
        paramVarArgs.g(9, this.srZ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label617;
      }
    }
    label617:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.scene) + f.a.a.a.fQ(3, this.srW) + f.a.a.a.fQ(4, this.rka) + f.a.a.a.fQ(5, this.srX) + f.a.a.a.fQ(6, this.srY);
      paramInt = i;
      if (this.username != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.username);
      }
      i = paramInt + f.a.a.a.fQ(8, this.aAk);
      paramInt = i;
      if (this.srZ != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.srZ);
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
        bvi localbvi = (bvi)paramVarArgs[1];
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
            localbvi.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbvi.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbvi.srW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbvi.rka = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbvi.srX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbvi.srY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbvi.username = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbvi.aAk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbvi.srZ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bvi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */