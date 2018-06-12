package com.tencent.mm.plugin.game.d;

import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.fk;
import f.a.a.b;
import java.util.LinkedList;

public final class bc
  extends bhd
{
  public String eJQ;
  public LinkedList<String> jRK = new LinkedList();
  public r jRL;
  public int jRM;
  public boolean jRN;
  public String jRj;
  public int jRk;
  
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
      if (this.jRj != null) {
        paramVarArgs.g(2, this.jRj);
      }
      paramVarArgs.d(3, 1, this.jRK);
      if (this.eJQ != null) {
        paramVarArgs.g(4, this.eJQ);
      }
      if (this.jRL != null)
      {
        paramVarArgs.fV(5, this.jRL.boi());
        this.jRL.a(paramVarArgs);
      }
      paramVarArgs.fT(6, this.jRM);
      paramVarArgs.av(7, this.jRN);
      paramVarArgs.fT(8, this.jRk);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label729;
      }
    }
    label729:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jRj != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jRj);
      }
      i += f.a.a.a.c(3, 1, this.jRK);
      paramInt = i;
      if (this.eJQ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.eJQ);
      }
      i = paramInt;
      if (this.jRL != null) {
        i = paramInt + f.a.a.a.fS(5, this.jRL.boi());
      }
      return i + f.a.a.a.fQ(6, this.jRM) + (f.a.a.b.b.a.ec(7) + 1) + f.a.a.a.fQ(8, this.jRk);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jRK.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        bc localbc = (bc)paramVarArgs[1];
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
            localbc.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbc.jRj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbc.jRK.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 4: 
          localbc.eJQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new r();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((r)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbc.jRL = ((r)localObject1);
            paramInt += 1;
          }
        case 6: 
          localbc.jRM = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbc.jRN = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        }
        localbc.jRk = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/d/bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */