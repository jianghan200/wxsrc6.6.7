package com.tencent.mm.plugin.game.d;

import f.a.a.b;
import java.util.LinkedList;

public final class q
  extends com.tencent.mm.bk.a
{
  public String jPS;
  public String jPT;
  public String jPU;
  public dm jPV;
  public int jPW;
  public int jPX;
  public String jPY;
  public int jPZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPS == null) {
        throw new b("Not all required fields were included: DownloadURL");
      }
      if (this.jPS != null) {
        paramVarArgs.g(1, this.jPS);
      }
      if (this.jPT != null) {
        paramVarArgs.g(2, this.jPT);
      }
      if (this.jPU != null) {
        paramVarArgs.g(4, this.jPU);
      }
      if (this.jPV != null)
      {
        paramVarArgs.fV(5, this.jPV.boi());
        this.jPV.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.jPW);
      paramVarArgs.fT(7, this.jPX);
      if (this.jPY != null) {
        paramVarArgs.g(8, this.jPY);
      }
      paramVarArgs.fT(9, this.jPZ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPS == null) {
        break label650;
      }
    }
    label650:
    for (int i = f.a.a.b.b.a.h(1, this.jPS) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPT != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPT);
      }
      i = paramInt;
      if (this.jPU != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.jPU);
      }
      paramInt = i;
      if (this.jPV != null) {
        paramInt = i + f.a.a.a.fS(5, this.jPV.boi());
      }
      i = paramInt + f.a.a.a.fQ(6, this.jPW) + f.a.a.a.fQ(7, this.jPX);
      paramInt = i;
      if (this.jPY != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.jPY);
      }
      return paramInt + f.a.a.a.fQ(9, this.jPZ);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.jPS != null) {
          break;
        }
        throw new b("Not all required fields were included: DownloadURL");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        q localq = (q)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        case 3: 
        default: 
          return -1;
        case 1: 
          localq.jPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localq.jPT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localq.jPU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new dm();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((dm)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localq.jPV = ((dm)localObject1);
            paramInt += 1;
          }
        case 6: 
          localq.jPW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localq.jPX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localq.jPY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localq.jPZ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/d/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */