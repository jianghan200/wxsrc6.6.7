package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ajg
  extends bhd
{
  public String dxc;
  public String iEL;
  public boolean rLZ;
  public String rMa;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.iEL == null) {
        throw new b("Not all required fields were included: appusername");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.av(2, this.rLZ);
      if (this.dxc != null) {
        paramVarArgs.g(3, this.dxc);
      }
      if (this.iEL != null) {
        paramVarArgs.g(4, this.iEL);
      }
      if (this.rMa != null) {
        paramVarArgs.g(5, this.rMa);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label506;
      }
    }
    label506:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + (f.a.a.b.b.a.ec(2) + 1);
      paramInt = i;
      if (this.dxc != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.dxc);
      }
      i = paramInt;
      if (this.iEL != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.iEL);
      }
      paramInt = i;
      if (this.rMa != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rMa);
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
        if (this.iEL != null) {
          break;
        }
        throw new b("Not all required fields were included: appusername");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ajg localajg = (ajg)paramVarArgs[1];
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
            localajg.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localajg.rLZ = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 3: 
          localajg.dxc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localajg.iEL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localajg.rMa = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ajg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */