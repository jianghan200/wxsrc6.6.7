package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bhg
  extends bhd
{
  public String bPS;
  public int kLe;
  public String kLf;
  public int qYf;
  public long sbh;
  public int sid;
  public int sie;
  
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
      if (this.bPS != null) {
        paramVarArgs.g(2, this.bPS);
      }
      paramVarArgs.fT(3, this.kLe);
      paramVarArgs.fT(4, this.qYf);
      paramVarArgs.T(5, this.sbh);
      paramVarArgs.fT(6, this.sid);
      if (this.kLf != null) {
        paramVarArgs.g(7, this.kLf);
      }
      paramVarArgs.fT(8, this.sie);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label574;
      }
    }
    label574:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bPS != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bPS);
      }
      i = i + f.a.a.a.fQ(3, this.kLe) + f.a.a.a.fQ(4, this.qYf) + f.a.a.a.S(5, this.sbh) + f.a.a.a.fQ(6, this.sid);
      paramInt = i;
      if (this.kLf != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.kLf);
      }
      return paramInt + f.a.a.a.fQ(8, this.sie);
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
        bhg localbhg = (bhg)paramVarArgs[1];
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
            localbhg.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbhg.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbhg.kLe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbhg.qYf = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbhg.sbh = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 6: 
          localbhg.sid = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbhg.kLf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbhg.sie = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bhg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */