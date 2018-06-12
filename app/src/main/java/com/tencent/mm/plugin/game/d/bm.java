package com.tencent.mm.plugin.game.d;

import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.fk;
import f.a.a.b;
import java.util.LinkedList;

public final class bm
  extends bhd
{
  public String eJQ;
  public String jRj;
  public int jSa;
  public int jSb;
  public int jSi;
  public int jSj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jRj == null) {
        throw new b("Not all required fields were included: Lang");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.jSa);
      paramVarArgs.fT(3, this.jSb);
      if (this.jRj != null) {
        paramVarArgs.g(4, this.jRj);
      }
      paramVarArgs.fT(5, this.jSi);
      paramVarArgs.fT(6, this.jSj);
      if (this.eJQ != null) {
        paramVarArgs.g(7, this.eJQ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label571;
      }
    }
    label571:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.jSa) + f.a.a.a.fQ(3, this.jSb);
      paramInt = i;
      if (this.jRj != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jRj);
      }
      i = paramInt + f.a.a.a.fQ(5, this.jSi) + f.a.a.a.fQ(6, this.jSj);
      paramInt = i;
      if (this.eJQ != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.eJQ);
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
        if (this.jRj != null) {
          break;
        }
        throw new b("Not all required fields were included: Lang");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bm localbm = (bm)paramVarArgs[1];
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
            localbm.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbm.jSa = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbm.jSb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbm.jRj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbm.jSi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbm.jSj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbm.eJQ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/d/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */