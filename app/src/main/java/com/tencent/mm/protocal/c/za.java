package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class za
  extends bhd
{
  public String bPS;
  public int count;
  public String desc;
  public int rFc;
  public int rFd;
  public String rFe;
  public String rFf;
  public String rFg;
  public int scene;
  public String sign;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bPS == null) {
        throw new b("Not all required fields were included: appid");
      }
      if (this.rFf == null) {
        throw new b("Not all required fields were included: busi_id");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rFc);
      if (this.bPS != null) {
        paramVarArgs.g(3, this.bPS);
      }
      if (this.desc != null) {
        paramVarArgs.g(4, this.desc);
      }
      paramVarArgs.fT(5, this.rFd);
      if (this.rFe != null) {
        paramVarArgs.g(6, this.rFe);
      }
      paramVarArgs.fT(7, this.count);
      paramVarArgs.fT(8, this.scene);
      if (this.rFf != null) {
        paramVarArgs.g(9, this.rFf);
      }
      if (this.sign != null) {
        paramVarArgs.g(10, this.sign);
      }
      if (this.rFg != null) {
        paramVarArgs.g(11, this.rFg);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label835;
      }
    }
    label835:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rFc);
      paramInt = i;
      if (this.bPS != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.bPS);
      }
      i = paramInt;
      if (this.desc != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.desc);
      }
      i += f.a.a.a.fQ(5, this.rFd);
      paramInt = i;
      if (this.rFe != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rFe);
      }
      i = paramInt + f.a.a.a.fQ(7, this.count) + f.a.a.a.fQ(8, this.scene);
      paramInt = i;
      if (this.rFf != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rFf);
      }
      i = paramInt;
      if (this.sign != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.sign);
      }
      paramInt = i;
      if (this.rFg != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rFg);
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
        if (this.bPS == null) {
          throw new b("Not all required fields were included: appid");
        }
        if (this.rFf != null) {
          break;
        }
        throw new b("Not all required fields were included: busi_id");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        za localza = (za)paramVarArgs[1];
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
            localza.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localza.rFc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localza.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localza.desc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localza.rFd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localza.rFe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localza.count = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localza.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localza.rFf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localza.sign = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localza.rFg = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */