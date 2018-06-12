package com.tencent.mm.plugin.game.d;

import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.fk;
import f.a.a.b;
import java.util.LinkedList;

public final class dc
  extends bhd
{
  public String eJQ;
  public String jOZ;
  public String jPc;
  public boolean jPp;
  public String jRj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jRj == null) {
        throw new b("Not all required fields were included: Lang");
      }
      if (this.jPc == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.jRj != null) {
        paramVarArgs.g(2, this.jRj);
      }
      if (this.jPc != null) {
        paramVarArgs.g(3, this.jPc);
      }
      if (this.jOZ != null) {
        paramVarArgs.g(4, this.jOZ);
      }
      if (this.eJQ != null) {
        paramVarArgs.g(5, this.eJQ);
      }
      paramVarArgs.av(6, this.jPp);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label593;
      }
    }
    label593:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jRj != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jRj);
      }
      i = paramInt;
      if (this.jPc != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jPc);
      }
      paramInt = i;
      if (this.jOZ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOZ);
      }
      i = paramInt;
      if (this.eJQ != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.eJQ);
      }
      return i + (f.a.a.b.b.a.ec(6) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.jRj == null) {
          throw new b("Not all required fields were included: Lang");
        }
        if (this.jPc != null) {
          break;
        }
        throw new b("Not all required fields were included: AppID");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        dc localdc = (dc)paramVarArgs[1];
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
            localdc.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localdc.jRj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localdc.jPc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localdc.jOZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localdc.eJQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localdc.jPp = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/d/dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */